# h1 Heading
## h2 Heading


## Horizontal Rules

___

---

***

## Emphasis

**This is bold text**

__This is bold text__

*This is italic text*

_This is italic text_

~~Strikethrough~~

## Lists
Unordered

+ Create a list by starting a line with `+`, `-`, or `*`
+ Sub-lists are made by indenting 2 spaces:
  - Marker character change forces new list start:
    * Ac tristique libero volutpat at
    + Facilisis in pretium nisl aliquet
    - Nulla volutpat aliquam velit
+ Very easy!

Ordered

1. Lorem ipsum dolor sit amet
2. Consectetur adipiscing elit
3. Integer molestie lorem at massa


1. You can use sequential numbers...
1. ...or keep all the numbers as `1.`

Start numbering with offset:

57. foo
1. bar


## Code

Inline `code`

Indented code

    // Some comments
    line 1 of code
    line 2 of code
    line 3 of code


Block code "fences"

```
Sample text here...
```

Syntax highlighting

``` js
var foo = function (bar) {
  return bar++;
};

console.log(foo(5));
```

## Tables
| Option | Description |
| ------ | ----------- |
| option 1   | Description 1 |
| option 2 | Description 2 |
| option 3    | Description 3 |

Right aligned columns
| Option | Description |
| ------:| -----------:|
| option 1   | Description 1 |
| option 2 | Description 2 |
| option 3    | Description 3 |

## Links

[My Linkedin](http://linkedin.com/in/mukeshsolanki/)

[My Medium](https://medium.com/@TheMukeshSolanki)

Autoconverted link https://github.com/nodeca/pica

and to a [section heading in the current doc](#horizontal-rules)

Here's a footnote [^1].
[^1]: Footnote text goes here.

## Images

![Minion](https://octodex.github.com/images/minion.png)
![Stormtroopocat](https://octodex.github.com/images/stormtroopocat.jpg "The Stormtroopocat")

Like links, Images also have a footnote style syntax

![Alt text][id]

With a reference later in the document defining the URL location

[id]: https://octodex.github.com/images/dojocat.jpg  "The Dojocat"
