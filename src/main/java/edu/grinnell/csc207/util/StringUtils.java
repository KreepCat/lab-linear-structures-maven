package edu.grinnell.csc207.util;

import edu.grinnell.csc207.linear.Stack;
import edu.grinnell.csc207.linear.LinkedStack;

import java.io.PrintWriter;

/**
 * Assorted utilities for working with strings.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class StringUtils {
  // +------------------+--------------------------------------------
  // | Provided methods |
  // +------------------+

  /**
   * Determine whether the parens match in string.
   */
  public static boolean checkMatching(String str) {
    Stack<Character> parens = new LinkedStack<Character>();
    for (int i = 0; i < str.length(); i++) {
      try {
        char charAti = str.charAt(i);
        if (charAti == '(' || charAti == '[' || charAti == '{' || charAti == '<') {
          parens.push(charAti);
        } else if (charAti == ')' || charAti == ']' || charAti == '}' || charAti == '>') {
          if (parens.isEmpty()){
            return false;
          }
          if ((charAti == ')' && parens.pop() == '(')) {
            
          } else if ((charAti == ']' && parens.pop() == '[')) {
            
          } else if ((charAti == '}' && parens.pop() == '{')) {
            
          } else if ((charAti == '>' && parens.pop() == '<')) {
            
          } else {
            return false;
          }
        }
      } catch (Exception e) {
        System.err.println("Failed to put() String at: " + i);
      }
    }
    return parens.isEmpty();
  } // checkMatching
} // class StringUtils

