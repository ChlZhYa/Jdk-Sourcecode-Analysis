/*
 * Copyright (c) 2007, 2019, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright 1999-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * $Id: DTMAxisIterator.java,v 1.2.4.1 2005/09/15 08:14:52 suresh_emailid Exp $
 */
package com.sun.org.apache.xml.internal.dtm;

/**
 * This class iterates over a single XPath Axis, and returns node handles.
 */
public interface DTMAxisIterator extends Cloneable
{

  /** Specifies the end of the iteration, and is the same as DTM.NULL.  */
  int END = DTM.NULL;

  /**
   * Get the next node in the iteration.
   *
   * @return The next node handle in the iteration, or END.
   */
  int next();


  /**
   * Resets the iterator to the last start node.
   *
   * @return A DTMAxisIterator, which may or may not be the same as this
   *         iterator.
   */
  DTMAxisIterator reset();

  /**
   * @return the number of nodes in this iterator.  This may be an expensive
   * operation when called the first time.
   */
  int getLast();

  /**
   * @return The position of the current node in the set, as defined by XPath.
   */
  int getPosition();

  /**
   * Remembers the current node for the next call to gotoMark().
   */
  void setMark();

  /**
   * Restores the current node remembered by setMark().
   */
  void gotoMark();

  /**
   * Set start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @param node Sets the root of the iteration.
   *
   * @return A DTMAxisIterator set to the start of the iteration.
   */
  DTMAxisIterator setStartNode(int node);

  /**
   * Get start to END should 'close' the iterator,
   * i.e. subsequent call to next() should return END.
   *
   * @return The root node of the iteration.
   */
  int getStartNode();

  /**
   * @return true if this iterator has a reversed axis, else false.
   */
  boolean isReverse();

  /**
   * @return a deep copy of this iterator. The clone should not be reset
   * from its current position.
   */
  DTMAxisIterator cloneIterator();

  /**
   * Set if restartable.
   */
  void setRestartable(boolean isRestartable);

  /**
   * Return the node at the given position.
   *
   * @param position The position
   * @return The node at the given position.
   */
  int getNodeByPosition(int position);
}
