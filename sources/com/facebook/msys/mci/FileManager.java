package com.facebook.msys.mci;

import X.AnonymousClass002;
import X.AnonymousClass0RZ;
import X.AnonymousClass0x9;
import X.AnonymousClass4IU;
import X.C18280x3;
import android.content.ContentResolver;
import android.os.Build;
import android.util.Log;
import com.facebook.msys.mcf.MsysError;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.zip.ZipException;

public class FileManager {
    public static final String TAG = "FileManager";
    public static File mCacheDir = null;
    public static ContentResolver mContentResolver = null;
    public static final String sFileManagerErrorDomain = "com.facebook.msys.filesystem";
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static void copyFile(String str, String str2) {
        AnonymousClass0RZ.A01("FileManager.copyFile");
        try {
            File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str2);
            if (!fileFromPathWithOptionalScheme.exists()) {
                tryToCreateDirectoryOfFile(str2);
                if (!str.startsWith("content://")) {
                    copyFileUsingFilePath(str, fileFromPathWithOptionalScheme);
                    return;
                }
                throw createFileManagerError(1, (Throwable) null);
            }
            throw createFileManagerError(2, (Throwable) null);
        } finally {
            AnonymousClass0RZ.A00();
        }
    }

    public static void copyInputStreamIntoOutputStream(InputStream inputStream, OutputStream outputStream) {
        AnonymousClass0RZ.A01("FileManager.copyInputStreamIntoOutputStream");
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                AnonymousClass0RZ.A00();
                return;
            }
        }
    }

    public static String createCacheDirectory(String str) {
        File A0A = AnonymousClass002.A0A(mCacheDir, str);
        if ((A0A.exists() && A0A.isDirectory()) || A0A.mkdirs()) {
            return A0A.toString();
        }
        throw createFileManagerError(7, (Throwable) null);
    }

    public static MsysError createFileManagerError(int i, Throwable th) {
        Map map;
        if (th != null) {
            map = Collections.singletonMap(MsysError.getLocalizedFailureReasonKey(), th.toString());
        } else {
            map = null;
        }
        return new MsysError(sFileManagerErrorDomain, i, map);
    }

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        File file;
        synchronized (FileManager.class) {
            if (str.startsWith("file://")) {
                file = new File(URI.create(str));
            } else if (str.startsWith("cache://")) {
                file = AnonymousClass002.A0A(mCacheDir, str.substring(8));
            } else {
                file = AnonymousClass002.A0B(str);
            }
        }
        return file;
    }

    public static synchronized boolean initialize(File file) {
        boolean initialize;
        synchronized (FileManager.class) {
            initialize = initialize(file, (ContentResolver) null);
        }
        return initialize;
    }

    public static void moveFile(String str, String str2) {
        AnonymousClass0RZ.A01("FileManager.moveFile");
        try {
            File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
            File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
            if (!fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) && !fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
                copyFile(str, str2);
                if (!fileFromPathWithOptionalScheme.delete()) {
                    throw createFileManagerError(8, (Throwable) null);
                }
            }
        } finally {
            AnonymousClass0RZ.A00();
        }
    }

    public static File[] sortFilesByNewestFirst(File[] fileArr) {
        if (fileArr != null && fileArr.length > 1) {
            Arrays.sort(fileArr, new AnonymousClass4IU(0));
        }
        return fileArr;
    }

    public static void copyFileUsingFilePath(String str, File file) {
        int i;
        FileOutputStream A0h;
        try {
            FileInputStream A0g = AnonymousClass0x9.A0g(getFileFromPathWithOptionalScheme(str));
            try {
                A0h = AnonymousClass0x9.A0h(file);
                if (Build.VERSION.SDK_INT >= 26) {
                    Files.copy(A0g, file.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                } else {
                    copyInputStreamIntoOutputStream(A0g, A0h);
                }
                A0h.close();
                A0g.close();
                return;
            } catch (Throwable th) {
                A0g.close();
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e) {
            e = e;
            i = 3;
            throw createFileManagerError(i, e);
        } catch (CharConversionException e2) {
            e = e2;
            i = 10;
            throw createFileManagerError(i, e);
        } catch (EOFException e3) {
            e = e3;
            i = 11;
            throw createFileManagerError(i, e);
        } catch (InterruptedIOException e4) {
            e = e4;
            i = 12;
            throw createFileManagerError(i, e);
        } catch (ObjectStreamException e5) {
            e = e5;
            i = 13;
            throw createFileManagerError(i, e);
        } catch (SyncFailedException e6) {
            e = e6;
            i = 14;
            throw createFileManagerError(i, e);
        } catch (UTFDataFormatException e7) {
            e = e7;
            i = 15;
            throw createFileManagerError(i, e);
        } catch (UnsupportedEncodingException e8) {
            e = e8;
            i = 16;
            throw createFileManagerError(i, e);
        } catch (ZipException e9) {
            e = e9;
            i = 17;
            throw createFileManagerError(i, e);
        } catch (IOException e10) {
            throw createFileManagerMaybeDiskSpaceError(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static void createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if ((!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) && !fileFromPathWithOptionalScheme.mkdirs()) {
            throw createFileManagerError(7, (Throwable) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1.contains("space") == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.msys.mcf.MsysError createFileManagerMaybeDiskSpaceError(java.io.IOException r2) {
        /*
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "space"
            boolean r1 = r1.contains(r0)
            r0 = 4
            if (r1 != 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            com.facebook.msys.mcf.MsysError r0 = createFileManagerError(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mci.FileManager.createFileManagerMaybeDiskSpaceError(java.io.IOException):com.facebook.msys.mcf.MsysError");
    }

    public static void deleteItem(String str) {
        if (!deleteItemRecursive(getFileFromPathWithOptionalScheme(str))) {
            throw createFileManagerError(8, (Throwable) null);
        }
    }

    public static boolean deleteItemRecursive(File file) {
        boolean delete;
        if (!file.isDirectory()) {
            return file.delete();
        }
        boolean z = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (z) {
                    delete = deleteItemRecursive(file2);
                }
                z = false;
            } else {
                if (z) {
                    delete = file2.delete();
                }
                z = false;
            }
            z = true;
            if (delete) {
            }
            z = false;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        sortFilesByNewestFirst(listFiles);
        if (listFiles != null) {
            int length = listFiles.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = listFiles[i].getAbsolutePath();
            }
            return strArr;
        }
        throw createFileManagerError(6, (Throwable) null);
    }

    public static byte[] readFile(String str) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(getFileFromPathWithOptionalScheme(str), "r");
            long length = randomAccessFile.length();
            if (length <= 2147483647L) {
                byte[] bArr = new byte[((int) length)];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            }
            Log.e("FileUtils", "Cannot read more than 2GB into an array");
            throw AnonymousClass002.A0C("Cannot read more than 2GB into an array");
        } catch (IOException e) {
            throw createFileManagerError(6, e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void tryToCreateDirectoryOfFile(String str) {
        File parentFile = getFileFromPathWithOptionalScheme(str).getParentFile();
        if (parentFile != null) {
            C18280x3.A10(parentFile);
        }
    }

    public static void writeDataToFile(byte[] bArr, String str, boolean z) {
        FileOutputStream fileOutputStream;
        tryToCreateDirectoryOfFile(str);
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        try {
            ByteArrayInputStream A0d = AnonymousClass0x9.A0d(bArr);
            try {
                fileOutputStream = new FileOutputStream(fileFromPathWithOptionalScheme, z);
                copyInputStreamIntoOutputStream(A0d, fileOutputStream);
                fileOutputStream.close();
                A0d.close();
                return;
            } catch (Throwable th) {
                A0d.close();
                throw th;
            }
            throw th;
        } catch (FileNotFoundException e) {
            throw createFileManagerError(3, e);
        } catch (IOException e2) {
            throw createFileManagerMaybeDiskSpaceError(e2);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public static synchronized boolean initialize(File file, ContentResolver contentResolver) {
        synchronized (FileManager.class) {
            AnonymousClass0RZ.A01("FileManager.initialize");
            try {
                if (sInitialized) {
                    return false;
                }
                mCacheDir = file;
                mContentResolver = contentResolver;
                nativeInitialize();
                sInitialized = true;
                AnonymousClass0RZ.A00();
                return true;
            } finally {
                AnonymousClass0RZ.A00();
            }
        }
    }
}
