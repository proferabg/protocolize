package dev.simplix.protocolize.api.item.objects;

import dev.simplix.protocolize.api.util.Either;

import java.util.Collections;
import java.util.List;

public class HolderSet<T> {

    private final Either<String, List<T>> set;

    public HolderSet(List<T> set) {
        this.set = Either.right(set);
    }

    public HolderSet(T set) {
        this.set = Either.right(Collections.singletonList(set));
    }

    public HolderSet(String tag){
        this.set = Either.left(tag);
    }

    public boolean hasTag(){
        return set.isLeft();
    }

    public String getTag(){
        return set.getLeft();
    }

    public boolean hasSet(){
        return set.isRight();
    }

    public List<T> getSet(){
        return set.getRight();
    }

    public Either<String, List<T>> getEither(){
        return set;
    }

}
