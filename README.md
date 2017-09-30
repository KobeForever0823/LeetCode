# LeetCode
# 9.9 first commit
1. Sum Problem
1, 15, 16, 18, 39, 40 etc
Solve: 
# 9.10 second commit
From begin to end, pick up an element each time and use two pointers to reduce the range.
Time: O(n^2)
Tips: margin condition
# 9.11
java: res.add(new ArrayList<Integer>(levelRes)); 
c++: res.push_back(levelRes);

An object needs to be instantiated.

LongestSubString:  
HashSet, check if it's unique. An object of set

reverse list:
three pointers:
p, q
p = head, head.next = null
a->b->c->d->e
null<-a b->c->d->e (r = q->next, q: b)
a<-b c->d->e (p: b, q: c, r: d)
...
a<-b<-c<-d<-e (p: e, q: null, r: null)

Reverse words:
split: regular expression(\\s+): avoid 'b    a'
trim

# 9.13
find restaurant:
To initialize a map we need two object classes. Map<String, Integer>

# 9.28
Palindrome:
longest:  build a map <char, int> to store data. if the value % 2 == 0 add them to length. Or add value - 1 to length. Of course, there'll be only one chance that we can allow an odd number into length(put it in the middle)

# 9.29
Simplify path: Using stringbuilder than string to save more time. (Modifying string needs to create new object, stringbuilder doesn't) 


