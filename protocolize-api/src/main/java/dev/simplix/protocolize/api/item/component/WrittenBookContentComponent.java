package dev.simplix.protocolize.api.item.component;

import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.item.objects.Book;

public interface WrittenBookContentComponent extends DataComponent {

    Book getBook();

    void setBook(Book book);

    static WrittenBookContentComponent create(Book book) {
        return Protocolize.getService(Factory.class).create(book);
    }

    interface Factory {

        WrittenBookContentComponent create(Book book);

    }

}
