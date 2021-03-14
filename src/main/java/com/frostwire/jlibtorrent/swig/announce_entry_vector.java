/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class announce_entry_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected announce_entry_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(announce_entry_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_announce_entry_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public announce_entry_vector() {
    this(libtorrent_jni.new_announce_entry_vector(), true);
  }

  public long size() {
    return libtorrent_jni.announce_entry_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.announce_entry_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.announce_entry_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.announce_entry_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.announce_entry_vector_clear(swigCPtr, this);
  }

  public void push_back(announce_entry x) {
    libtorrent_jni.announce_entry_vector_push_back(swigCPtr, this, announce_entry.getCPtr(x), x);
  }

  public announce_entry get(int i) {
    return new announce_entry(libtorrent_jni.announce_entry_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, announce_entry val) {
    libtorrent_jni.announce_entry_vector_set(swigCPtr, this, i, announce_entry.getCPtr(val), val);
  }

}
