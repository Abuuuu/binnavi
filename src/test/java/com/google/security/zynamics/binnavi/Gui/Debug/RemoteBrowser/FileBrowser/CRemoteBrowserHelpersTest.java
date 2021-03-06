/*
Copyright 2014 Google Inc. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.google.security.zynamics.binnavi.Gui.Debug.RemoteBrowser.FileBrowser;

import static org.junit.Assert.assertTrue;

import com.google.security.zynamics.binnavi.Gui.Debug.RemoteBrowser.FileBrowser.CRemoteBrowserHelpers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;


@RunWith(JUnit4.class)
public class CRemoteBrowserHelpersTest {
  @Test
  public void test1IsDrive() {
    final String pathname = "C:";
    final File file = new File(pathname);
    assertTrue(CRemoteBrowserHelpers.isDrive(file));
  }
}
