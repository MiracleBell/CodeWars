package kyu7;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the
 * "instructions" for the development and functioning of living organisms.
 * <p>
 * If you want to know more: http://en.wikipedia.org/wiki/DNA
 * <p>
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function
 * receives one side of the DNA (string, except for Haskell); you need to return the other
 * complementary side. DNA strand is never empty or there is no DNA at all.
 * <p>
 * Example: (input --> output)
 * <p>
 * "ATTGC" --> "TAACG",  "GTAT" --> "CATA"
 */

//Solved
public class DnaStrand {

  public static String makeComplement(String dna) {
    StringBuilder sb = new StringBuilder(dna);
    for (int i = 0; i < sb.length(); i++) {
      sb.replace(i, i + 1, swapper(sb.charAt(i)) + "");

    }
    return sb.toString();
  }

  public static char swapper(char symbol) {
    switch (symbol) {
      case 'A':
        return 'T';
      case 'T':
        return 'A';
      case 'G':
        return 'C';
      case 'C':
        return 'G';
      default:
        throw new IllegalArgumentException();
    }
  }
}
