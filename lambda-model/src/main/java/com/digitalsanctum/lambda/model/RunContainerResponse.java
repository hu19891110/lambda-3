package com.digitalsanctum.lambda.model;

import java.util.Objects;
import java.util.StringJoiner;

import static com.digitalsanctum.lambda.model.HttpStatus.SC_CREATED;

/**
 * @author Shane Witbeck
 * @since 8/9/16
 */
public class RunContainerResponse {
  
  private String containerId;
  private String name;
  private String hostname;
  private String endpoint;  
  private int statusCode;
  private String errorMessage;

  public RunContainerResponse(String containerId, String name, String hostname, String endpoint) {
    this.statusCode = SC_CREATED;
    this.containerId = containerId;
    this.name = name;
    this.hostname = hostname;
    this.endpoint = endpoint;
  }

  public RunContainerResponse(int statusCode, String errorMessage) {
    this.statusCode = statusCode;
    this.errorMessage = errorMessage;
  }

  public RunContainerResponse() {
  }

  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RunContainerResponse that = (RunContainerResponse) o;

    return Objects.equals(this.containerId, that.containerId) &&
        Objects.equals(this.endpoint, that.endpoint) &&
        Objects.equals(this.errorMessage, that.errorMessage) &&
        Objects.equals(this.hostname, that.hostname) &&
        Objects.equals(this.name, that.name) &&
        Objects.equals(this.statusCode, that.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, endpoint, errorMessage, hostname, name, statusCode);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
        .add("containerId = " + containerId)
        .add("endpoint = " + endpoint)
        .add("errorMessage = " + errorMessage)
        .add("hostname = " + hostname)
        .add("name = " + name)
        .add("statusCode = " + statusCode)
        .toString();
  }
}
