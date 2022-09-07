package com.revature.challenges.array_list;

/**
 * An ordered collection (also known as a sequence). The user of this interface has precise
 * control over where in the list each element is inserted. The user can access elements by
 * their integer index (position in the list), and search for elements in the list.
 *
 *
 * @param <T>
 */
public interface List<T> extends Collection<T> {

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     *
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     *
     */
    T get(int index);

    /**
     * Inserts the specified element at the specified position in this list (optional operation).
     * Shifts the element currently at that position (if any) and any subsequent elements to the
     * right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     *
     * @throws UnsupportedOperationException - if the set operation is not supported by this list
     * @throws ClassCastException - if the class of the specified element prevents it from being added to this list
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements
     * @throws IllegalArgumentException - if some property of the specified element prevents it from being added to this list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     *
     */
    void add(int index, T element);

    /**
     * Replaces the element at the specified position in this list with the specified element
     * (optional operation).
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     *
     * @throws UnsupportedOperationException - if the set operation is not supported by this list
     * @throws ClassCastException - if the class of the specified element prevents it from being added to this list
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements
     * @throws IllegalArgumentException - if some property of the specified element prevents it from being added to this list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     *
     */
    T set(int index, T element);

    /**
     * Removes the element at the specified position in this list (optional operation). Shifts any
     * subsequent elements to the left (subtracts one from their indices). Returns the element that
     * was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     *
     * @throws UnsupportedOperationException - if the remove operation is not supported by this list
     * @throws IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())
     *
     */
    T remove(int index);

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this
     * list does not contain the element. More formally, returns the lowest index i such that:
     *
     *      (o==null ? get(i)==null : o.equals(get(i)))
     *
     * or -1 if there is no such index.
     *
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
     *
     * @throws ClassCastException - if the type of the specified element is incompatible with this list (optional)
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements (optional)
     *
     */
    int indexOf(T element);

    /**
     * Returns the index of the last occurrence of the specified element in this list, or -1 if this list
     * does not contain the element. More formally, returns the highest index i such that:
     *      (o==null ? get(i)==null : o.equals(get(i)))
     *
     * or -1 if there is no such index.
     *
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
     *
     * @throws ClassCastException - if the type of the specified element is incompatible with this list (optional)
     * @throws NullPointerException - if the specified element is null and this list does not permit null elements (optional)
     *
     */
    int lastIndexOf(T element);

}
