/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum ChoiceSetStyle {
  Compact(0),
  Expanded;

  public final int swigValue() {
    return swigValue;
  }

  public static ChoiceSetStyle swigToEnum(int swigValue) {
    ChoiceSetStyle[] swigValues = ChoiceSetStyle.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ChoiceSetStyle swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ChoiceSetStyle.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ChoiceSetStyle() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ChoiceSetStyle(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ChoiceSetStyle(ChoiceSetStyle swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

