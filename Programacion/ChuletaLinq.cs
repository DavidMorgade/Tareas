// All methods avaliable using linq

using System;
using System.Collections.Generic;
using System.Linq;

public class ChuletaLinq(string[] args)
{
    List<Integer> numbers = new List<Integer> { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    // Select does a projection of the elements in the collection
    var result = numbers.Select(x => x * 2);
    // Where filters the elements in the collection
    var result = numbers.Where(x => x % 2 == 0);
    // OrderBy orders the elements in the collection
    var result = numbers.OrderBy(x => x);
    // OrderByDescending orders the elements in the collection in descending order
    var result = numbers.OrderByDescending(x => x);
    // Take takes the first n elements in the collection
    var result = numbers.Take(5);
    // Skip skips the first n elements in the collection
    var result = numbers.Skip(5);
    // First returns the first element in the collection
    var result = numbers.First();
    // Last returns the last element in the collection
    var result = numbers.Last();
    // Single returns the only element in the collection
    var result = numbers.Single();
    // Count returns the number of elements in the collection
    var result = numbers.Count();
    // Sum returns the sum of the elements in the collection
    var result = numbers.Sum();
    // Average returns the average of the elements in the collection
    var result = numbers.Average();
    // Aggregate applies an accumulator function over a sequence
    var result = numbers.Aggregate((x, y) => x + y);
    // All determines whether all elements in the collection satisfy a condition
    var result = numbers.All(x => x > 5);
    // Any determines whether any element in the collection satisfies a condition
    var result = numbers.Any(x => x > 5);
    // Contains determines whether a specified value is in the collection
    var result = numbers.Contains(5);
    // Distinct returns distinct elements from the collection
    var result = numbers.Distinct();
    // Except returns the elements in the collection that are not in a second collection
    var result = numbers.Except(new List<Integer> { 1, 2, 3 });
    // Intersect returns the elements that are common to two collections
    var result = numbers.Intersect(new List<Integer> { 1, 2, 3 });
    // Union returns the unique elements in the collection and a second collection
    var result = numbers.Union(new List<Integer> { 1, 2, 3 });
    // ElementAt returns the element at a specified index in the collection
    var result = numbers.ElementAt(5);
    // ElementAtOrDefault returns the element at a specified index in the collection or a default value if the index is out of range
    var result = numbers.ElementAtOrDefault(5);
    // FirstOrDefault returns the first element in the collection or a default value if the collection is empty
    var result = numbers.FirstOrDefault();
    // LastOrDefault returns the last element in the collection or a default value if the collection is empty
    var result = numbers.LastOrDefault();
    // SingleOrDefault returns the only element in the collection or a default value if the collection is empty
    var result = numbers.SingleOrDefault();
    // Max returns the maximum value in the collection
    var result = numbers.Max();
    // Min returns the minimum value in the collection
    var result = numbers.Min();
    // Range generates a collection of integral numbers within a specified range
    var result = Enumerable.Range(1, 10);
    // Repeat generates a collection that contains one repeated value
    var result = Enumerable.Repeat("Hello", 5);
    // ToArray converts the collection to an array
    var result = numbers.ToArray();
    // ToList converts the collection to a list
    var result = numbers.ToList();
    // ToDictionary converts the collection to a dictionary
    var result = numbers.ToDictionary(x => x);
    // ToLookup converts the collection to a lookup
    var result = numbers.ToLookup(x => x);
    // Cast casts the elements in the collection to a specified type
    var result = numbers.Cast<Integer>();
    // OfType filters the elements in the collection to a specified type
    var result = numbers.OfType<Integer>();
    // AsEnumerable returns the collection as an enumerable
    var result = numbers.AsEnumerable();
    // AsQueryable returns the collection as a queryable
    var result = numbers.AsQueryable();
    // Reverse reverses the order of the elements in the collection
    var result = numbers.Reverse();
    // SequenceEqual determines whether two collections are equal
    var result = numbers.SequenceEqual(new List<Integer> { 1, 2, 3 });
    // Zip applies a specified function to the corresponding elements of two collections, producing a collection of the results
    var result = numbers.Zip(new List<Integer> { 1, 2, 3 }, (x, y) => x + y);
    // Join correlates the elements of two collections based on matching keys
    var result = numbers.Join(new List<Integer> { 1, 2, 3 }, x => x, y => y, (x, y) => x + y);
    // GroupBy groups the elements of the collection based on a specified key
    var result = numbers.GroupBy(x => x);
    // ToLookup converts the collection to a lookup
    var result = numbers.ToLookup(x => x);
    // ToDictionary converts the collection to a dictionary
    var result = numbers.ToDictionary(x => x);


}