package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.util.Either;

public class Holder<T extends Enum<T>, U> {

    private final Either<T, U> either;

    public Holder(T t, U u){
        if(t != null) either = Either.left(t);
        else either = Either.right(u);
    }

    public static <T extends Enum<T>, U> Holder<T, U> registry(T t){
        return new Holder<T, U>(t, null);
    }

    public static <T extends Enum<T>, U> Holder<T, U> direct(U u){
        return new Holder<T, U>(null, u);
    }

    public boolean isDirect(){
        return either.isRight();
    }

    public U getDirect(){
        return either.getRight();
    }

    public boolean isRegistry(){
        return either.isLeft();
    }

    public T getRegistry(){
        return either.getLeft();
    }

    public Either<T, U> getEither(){
        return either;
    }

}
