package com.baidu.disconf.core.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.baidu.disconf.core.test.path.DisconfWebPathMgrTestCase;
import com.baidu.disconf.core.test.path.ZooPathMgrTestCase;

@RunWith(Suite.class)
@SuiteClasses({ DisconfWebPathMgrTestCase.class, ZooPathMgrTestCase.class })
public class TestSuite {

}