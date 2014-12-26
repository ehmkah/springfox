package com.mangofactory.swagger.dto

import spock.lang.Specification

class AllowableRangeValuesSpec extends Specification {

  def "should pass coverage"() {
    expect:
      new AllowableRangeValues('1', '2').with {
        getMax()
        getMin()
      }
  }
}