package dao;

import java.util.List;

public interface IGenericDAO<T, MA> {

	List<T> findALL();

	T timTheoMa(MA ma);

	T them(T obj);

	T xoa(T obj);

	Boolean xoaTheoMa(MA ma);

	T sua(T obj);

}
