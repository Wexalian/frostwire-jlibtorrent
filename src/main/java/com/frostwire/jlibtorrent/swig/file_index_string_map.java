/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class file_index_string_map {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected file_index_string_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(file_index_string_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_file_index_string_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public file_index_string_map() {
    this(libtorrent_jni.new_file_index_string_map__SWIG_0(), true);
  }

  public file_index_string_map(file_index_string_map arg0) {
    this(libtorrent_jni.new_file_index_string_map__SWIG_1(file_index_string_map.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return libtorrent_jni.file_index_string_map_size(swigCPtr, this);
  }

  public boolean empty() {
    return libtorrent_jni.file_index_string_map_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.file_index_string_map_clear(swigCPtr, this);
  }

  public String get(int key) {
    return libtorrent_jni.file_index_string_map_get(swigCPtr, this, key);
  }

  public void set(int key, String x) {
    libtorrent_jni.file_index_string_map_set(swigCPtr, this, key, x);
  }

  public void erase(int key) {
    libtorrent_jni.file_index_string_map_erase(swigCPtr, this, key);
  }

  public boolean has_key(int key) {
    return libtorrent_jni.file_index_string_map_has_key(swigCPtr, this, key);
  }

  public file_index_vector keys() {
    return new file_index_vector(libtorrent_jni.file_index_string_map_keys(swigCPtr, this), true);
  }

}
