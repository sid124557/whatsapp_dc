package com.facebook.stash.core;

import X.C186098uk;
import java.io.File;

public interface FileStash extends C186098uk {
    File getFile(String str);

    File getFilePath(String str);

    File insertFile(String str);
}
