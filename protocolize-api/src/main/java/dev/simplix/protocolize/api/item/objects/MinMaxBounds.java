package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.util.Either;
import lombok.AllArgsConstructor;
import lombok.Data;

public class MinMaxBounds<T> {

    private Either<T, Range<T>> bounds;

    public MinMaxBounds(T exact) {
        bounds = Either.left(exact);
    }

    public MinMaxBounds(T min, T max) {
        bounds = Either.right(new Range<>(min, max));
    }

    public boolean isExact(){
        return bounds.isLeft();
    }

    public boolean isRange(){
        return bounds.isRight();
    }

    public T getExact(){
        return bounds.getLeft();
    }

    public void setExact(T exact){
        this.bounds = Either.left(exact);
    }

    public Range<T> getRange(){
        return bounds.getRight();
    }

    public void setRange(Range<T> range){
        this.bounds = Either.right(range);
    }

    public void setMin(T min){
        if(bounds.isRight()){
            this.bounds.getRight().setMin(min);
        } else {
            this.bounds = Either.right(new Range<>(min, null));
        }
    }

    public void setMax(T max){
        if(bounds.isRight()){
            this.bounds.getRight().setMax(max);
        } else {
            this.bounds = Either.right(new Range<>(null, max));
        }
    }

    public Either<T, Range<T>> getEither(){
        return bounds;
    }

    @Data
    @AllArgsConstructor
    public static class Range<T> {
        private T min, max;
    }
}
