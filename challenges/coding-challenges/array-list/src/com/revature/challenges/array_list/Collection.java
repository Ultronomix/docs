package com.revature.challenges.array_list;

/**
 * The root interface in the collection hierarchy. A collection represents a group of objects, known as
 * its elements. Some collections allow duplicate elements and others do not. Some are ordered and others
 * unordered.
 *
 * It is not intended for you to provide any direct implementations of this interface. You are to provide
 * implementations of more specific subinterfaces like Set, List, etc. This interface is typically used to
 * pass collections around and manipulate them where maximum generality is desired.
 *
 * All general-purpose Collection implementation classes (which typically implement Collection indirectly
 * through one of its subinterfaces) should provide two "standard" constructors:
 *
 *      - a void (no arguments) constructor, which creates an empty collection,
 *      - a single argument constructor accepting type Collection, which creates a new collection with the same
 *        elements as its argument.
 *
 * @param <T>
 */
public interface Collection<T> {

    /**
     * Ensures that this collection contains the specified element (optional operation). Returns true if this
     * collection changed as a result of the call. (Returns false if this collection does not permit duplicates
     * and already contains the specified element.)
     *
     * @param element element whose presence in this collection is to be ensured
     * @return true if this collection changed as a result of the call
     *
     * @throws UnsupportedOperationException - if the add operation is not supported by this collection
     * @throws ClassCastException - if the class of the specified element prevents it from being added to this collection
     * @throws NullPointerException - if the specified element is null and this collection does not permit null elements
     * @throws IllegalArgumentException - if some property of the element prevents it from being added to this collection
     * @throws IllegalStateException - if the element cannot be added at this time due to insertion restrictions
     *
     */
    boolean add(T element);
    boolean contains(T element);
    boolean isEmpty();

    /**
     * Removes a single instance of the specified element from this collection, if it is present (optional operation).
     * More formally, removes an element e such that (o==null ? e==null : o.equals(e)), if this collection contains
     * one or more such elements. Returns true if this collection contained the specified element (or equivalently,
     * if this collection changed as a result of the call).
     *
     * @param element element to be removed from this collection, if present
     * @return true if an element was removed as a result of this call
     *
     * @throws ClassCastException - if the type of the specified element is incompatible with this collection (optional)
     * @throws NullPointerException - if the specified element is null and this collection does not permit null elements (optional)
     * @throws UnsupportedOperationException - if the remove operation is not supported by this collection
     *
     */
    boolean remove(T element);

    /**
     * Returns the number of elements in this collection. If this collection contains more than Integer.MAX_VALUE
     * elements, returns Integer.MAX_VALUE.
     *
     * @return the number of elements in this collection
     *
     */
    int size();

}

