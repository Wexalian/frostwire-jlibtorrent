/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class torrent_status_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected torrent_status_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(torrent_status_vector obj) {
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
        libtorrent_jni.delete_torrent_status_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public torrent_status_vector() {
    this(libtorrent_jni.new_torrent_status_vector(), true);
  }

  public long size() {
    return libtorrent_jni.torrent_status_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.torrent_status_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.torrent_status_vector_reserve(swigCPtr, this, n);
  }

  public boolean empty() {
    return libtorrent_jni.torrent_status_vector_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.torrent_status_vector_clear(swigCPtr, this);
  }

  public void push_back(torrent_status x) {
    libtorrent_jni.torrent_status_vector_push_back(swigCPtr, this, torrent_status.getCPtr(x), x);
  }

  public torrent_status get(int i) {
    return new torrent_status(libtorrent_jni.torrent_status_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, torrent_status val) {
    libtorrent_jni.torrent_status_vector_set(swigCPtr, this, i, torrent_status.getCPtr(val), val);
  }

}
