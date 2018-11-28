package io.github.jaymzee.categorytheory;
// Category Theory for Product
//
//              C
//             /.\
//           /  .  \
//       f /  <f,g>  \ g
//       /      .      \
//     v        v        v
//    A<--fst--AxB--snd-->B
//
// Haskell snippet (product of types is built-in using tuples)
//   AxB :: (A,B)
//   AxB  = (x,y)
//
//   fst AxB
//   snd AxB
//
// Java snippet (using the this library)
//   Product<Double, Boolean> value = new Product<>(3.14, True);
//   ... value.getFst();
//   ... value.getSnd();
//
public class Product<A,B> {
    private A fst;
    private B snd;

    public Product(A fst, B snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public A getFst() {
        return fst;
    }

    public B getSnd() {
        return snd;
    }

    public String toString() {
        return String.format("[Prod (%s, %s)]", fst, snd);
    }
}