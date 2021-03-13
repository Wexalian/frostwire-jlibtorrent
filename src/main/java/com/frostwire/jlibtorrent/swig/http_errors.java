/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public final class http_errors {
  public final static http_errors cont = new http_errors("cont", libtorrent_jni.cont_get());
  public final static http_errors ok = new http_errors("ok", libtorrent_jni.ok_get());
  public final static http_errors created = new http_errors("created", libtorrent_jni.created_get());
  public final static http_errors accepted = new http_errors("accepted", libtorrent_jni.accepted_get());
  public final static http_errors no_content = new http_errors("no_content", libtorrent_jni.no_content_get());
  public final static http_errors multiple_choices = new http_errors("multiple_choices", libtorrent_jni.multiple_choices_get());
  public final static http_errors moved_permanently = new http_errors("moved_permanently", libtorrent_jni.moved_permanently_get());
  public final static http_errors moved_temporarily = new http_errors("moved_temporarily", libtorrent_jni.moved_temporarily_get());
  public final static http_errors not_modified = new http_errors("not_modified", libtorrent_jni.not_modified_get());
  public final static http_errors bad_request = new http_errors("bad_request", libtorrent_jni.bad_request_get());
  public final static http_errors unauthorized = new http_errors("unauthorized", libtorrent_jni.unauthorized_get());
  public final static http_errors forbidden = new http_errors("forbidden", libtorrent_jni.forbidden_get());
  public final static http_errors not_found = new http_errors("not_found", libtorrent_jni.not_found_get());
  public final static http_errors internal_server_error = new http_errors("internal_server_error", libtorrent_jni.internal_server_error_get());
  public final static http_errors not_implemented = new http_errors("not_implemented", libtorrent_jni.not_implemented_get());
  public final static http_errors bad_gateway = new http_errors("bad_gateway", libtorrent_jni.bad_gateway_get());
  public final static http_errors service_unavailable = new http_errors("service_unavailable", libtorrent_jni.service_unavailable_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static http_errors swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + http_errors.class + " with value " + swigValue);
  }

  private http_errors(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private http_errors(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private http_errors(String swigName, http_errors swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static http_errors[] swigValues = { cont, ok, created, accepted, no_content, multiple_choices, moved_permanently, moved_temporarily, not_modified, bad_request, unauthorized, forbidden, not_found, internal_server_error, not_implemented, bad_gateway, service_unavailable };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

