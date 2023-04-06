/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

// @generated by enums.py

package com.facebook.yoga;

public enum YogaExperimentalFeature {
  WEB_FLEX_BASIS(0),
  ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE(1),
  FIX_ABSOLUTE_TRAILING_COLUMN_MARGIN(2);

  private final int mIntValue;

  YogaExperimentalFeature(int intValue) {
    mIntValue = intValue;
  }

  public int intValue() {
    return mIntValue;
  }

  public static YogaExperimentalFeature fromInt(int value) {
    switch (value) {
      case 0: return WEB_FLEX_BASIS;
      case 1: return ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE;
      case 2: return FIX_ABSOLUTE_TRAILING_COLUMN_MARGIN;
      default: throw new IllegalArgumentException("Unknown enum value: " + value);
    }
  }
}