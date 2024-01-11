package Interface;

public interface DB_CRUD<T> { //если мы не знаем аргументы каких типов мы будем использовать, то в <> мы записываем любую букву или имя для обобщения(generic) того какой тип объекта мы будем использовать.
    void create(T obj);
    void read(T obj);
    void update(T obj);
    void delete(T obj);
}
