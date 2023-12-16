package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass342;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18330xA;
import X.C64713Eq;
import X.C73223f8;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

public class Log {
    public static final CharsetEncoder DO_LOG_ENCODER = Charset.defaultCharset().newEncoder();
    public static final ByteBuffer DO_LOG_ENCODE_BUFFER = ByteBuffer.allocate(16384);
    public static final C73223f8 LOGGER_THREAD;
    public static final PrintStream ORIGINAL_SYSTEM_ERR = System.err;
    public static FileChannel channel = null;
    public static final Object compressFileLock = AnonymousClass002.A0D();
    public static C64713Eq connectivityInfoProvider = null;
    public static int level = 5;
    public static final AtomicReference logDirRef = new AtomicReference();
    public static File logFile;
    public static final CountDownLatch logFileLatch = new CountDownLatch(1);
    public static File logTempFile;
    public static final Object tempFileLock = AnonymousClass002.A0D();
    public static final ReentrantLock writeFileLock = new ReentrantLock(true);

    public static void flush() {
        try {
            blockingLog(5, "log/flush/start");
            C73223f8 r4 = LOGGER_THREAD;
            if (Thread.currentThread() == r4) {
                int size = r4.A02.size();
                for (int i = 0; i < size; i++) {
                    r4.A00();
                }
            } else {
                FutureTask futureTask = new FutureTask(C73223f8.A05, (Object) null);
                r4.A01(futureTask);
                while (!futureTask.isDone()) {
                    try {
                        futureTask.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            blockingLog(5, "log/flush/logs written");
            blockingLog(5, "log/flush/forcing to disk");
            ReentrantLock reentrantLock = writeFileLock;
            reentrantLock.lock();
            FileChannel fileChannel = channel;
            if (fileChannel != null && fileChannel.isOpen()) {
                channel.force(true);
            }
            reentrantLock.unlock();
            blockingLog(5, "log/flush/end");
        } catch (IOException e) {
            String A0P = AnonymousClass000.A0P(e, "; exception=", AnonymousClass000.A0l("log/flush/failed"));
            String stackTraceString = getStackTraceString(e);
            StringBuilder sb = new StringBuilder(A0P.length() + 1 + stackTraceString.length());
            sb.append(A0P);
            sb.append("\n");
            sb.append(stackTraceString);
            String adorn = adorn("LL_E ", sb);
            doLogToFile(adorn);
            if (level == 5) {
                logToLogcat(1, adorn);
            }
        } catch (Throwable th) {
            writeFileLock.unlock();
            throw th;
        }
    }

    static {
        C73223f8 r0 = new C73223f8();
        r0.start();
        LOGGER_THREAD = r0;
    }

    public static void a(boolean z) {
        if (!z) {
            log("LL_A ", "Assertion Failed");
        }
    }

    public static void blockingLog(int i, String str) {
        if (i <= level) {
            String adorn = adorn(getLogPrefix(i), C18330xA.A0A(str));
            logAdorned(adorn, true);
            if (level == 5) {
                logToLogcat(i, adorn);
            }
        }
    }

    public static void d(String str) {
        C18310x6.A1L("LL_D ", str, level, 4);
    }

    public static void doLogToLogcat(int i, String str) {
        if (i == 0 || i == 5) {
            android.util.Log.v("WhatsApp", str);
        } else if (i == 4) {
            android.util.Log.d("WhatsApp", str);
        } else if (i == 3) {
            android.util.Log.i("WhatsApp", str);
        } else if (i == 2) {
            android.util.Log.w("WhatsApp", str);
        } else {
            android.util.Log.e("WhatsApp", str);
        }
    }

    public static void e(String str) {
        C18310x6.A1L("LL_E ", str, level, 1);
    }

    public static ArrayList getLatestLogs(int i) {
        File file = logFile;
        SimpleDateFormat A0u = AnonymousClass0x7.A0u("yyyy-MM-dd");
        ArrayList A0s = AnonymousClass001.A0s();
        Date date = new Date();
        String pattern = A0u.toPattern();
        String name = file.getName();
        String A0T = AnonymousClass000.A0T(name.substring(name.indexOf(46)), ".gz");
        String A01 = AnonymousClass342.A01(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            for (File file2 : listFiles) {
                String name2 = file2.getName();
                if (name2.startsWith(A01) && name2.endsWith(A0T)) {
                    int length = A01.length();
                    try {
                        if ((date.getTime() - A0u.parse(name2.substring(length, pattern.length() + length)).getTime()) / AnonymousClass0x7.A0B() < ((long) i)) {
                            A0s.add(file2);
                        }
                    } catch (ParseException unused) {
                    }
                }
            }
        }
        return A0s;
    }

    public static String getLogPrefix(int i) {
        if (i == 0) {
            return "LL_A ";
        }
        if (i == 1) {
            return "LL_E ";
        }
        if (i == 2) {
            return "LL_W ";
        }
        if (i == 3) {
            return "LL_I ";
        }
        if (i != 4) {
            return "LL_V ";
        }
        return "LL_D ";
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0l = AnonymousClass000.A0l("2.23.26.14");
        A0l.append("(");
        A0l.append(546598543);
        String A0e = AnonymousClass000.A0e(A0l);
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("### begin stack trace ");
        A0o2.append(A0e);
        C18270x1.A1C("\n", A0o2, A0o);
        AnonymousClass000.A1B(C18300x5.A0W(th), A0o);
        return AnonymousClass000.A0X("### end stack trace", A0o);
    }

    public static void i(String str) {
        C18310x6.A1L("LL_I ", str, level, 3);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean initialize() {
        /*
            java.nio.channels.FileChannel r0 = channel
            r3 = 1
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x000c
            return r3
        L_0x000c:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L_0x0029
            java.util.concurrent.CountDownLatch r0 = logFileLatch
            long r4 = r0.getCount()
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "If Log.initialize() is called on the main thread,  Log.setApplicationContext() must have been called beforehand."
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        L_0x0029:
            r6 = 0
            java.util.concurrent.CountDownLatch r0 = logFileLatch     // Catch:{ InterruptedException -> 0x00f1 }
            r0.await()     // Catch:{ InterruptedException -> 0x00f1 }
            java.util.concurrent.atomic.AtomicReference r0 = logDirRef
            java.lang.Object r1 = r0.get()
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L_0x0045
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0046
            boolean r0 = r1.mkdirs()
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            return r6
        L_0x0046:
            java.io.File r1 = logFile     // Catch:{  }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{  }
            r0.<init>(r1, r3)     // Catch:{  }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{  }
            channel = r0     // Catch:{  }
            java.io.PrintStream r5 = java.lang.System.err
            java.io.PrintStream r0 = ORIGINAL_SYSTEM_ERR
            boolean r4 = X.C18300x5.A1W(r5, r0)
            X.6uX r2 = new X.6uX
            r2.<init>(r0)
            java.nio.channels.FileChannel r0 = channel
            java.io.OutputStream r0 = java.nio.channels.Channels.newOutputStream(r0)
            X.6uU r1 = new X.6uU
            r1.<init>(r2, r0)
            java.io.PrintStream r0 = new java.io.PrintStream
            r0.<init>(r1, r3)
            java.lang.System.setErr(r0)
            if (r4 == 0) goto L_0x00eb
            r5.close()
        L_0x0078:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0 = 15
            int r5 = r1.get(r0)
            r0 = 16
            int r0 = r1.get(r0)
            int r5 = r5 + r0
            r0 = 60000(0xea60, float:8.4078E-41)
            int r5 = r5 / r0
            int r4 = r5 / 60
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass0x9.A1X()
            r0 = 43
            if (r4 >= 0) goto L_0x009b
            r0 = 45
        L_0x009b:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1[r6] = r0
            int r0 = java.lang.Math.abs(r4)
            X.AnonymousClass000.A1P(r1, r0, r3)
            int r0 = r5 % 60
            int r0 = java.lang.Math.abs(r0)
            X.AnonymousClass000.A1N(r1, r0)
            java.lang.String r0 = "%c%02d%02d"
            java.lang.String r2 = java.lang.String.format(r2, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "==== logfile level="
            r1.append(r0)
            int r0 = level
            r1.append(r0)
            java.lang.String r0 = " tz="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " ===="
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r1 = "LL_I "
            java.lang.StringBuilder r0 = X.C18330xA.A0A(r0)
            java.lang.String r0 = adorn(r1, r0)
            logAdorned(r0, r3)
            java.nio.channels.FileChannel r0 = channel
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L_0x00ef
            return r3
        L_0x00eb:
            r5.flush()
            goto L_0x0078
        L_0x00ef:
            r3 = 0
            return r3
        L_0x00f1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.initialize():boolean");
    }

    public static String logAdorned(String str, boolean z) {
        Thread currentThread;
        C73223f8 r0;
        if (!z && (currentThread = Thread.currentThread()) != (r0 = LOGGER_THREAD)) {
            if (currentThread == r0) {
                blockingLog(2, "postLog called on the logging thread. Next log will be out of order.");
            } else {
                r0.A01(str);
                return str;
            }
        }
        doLogToFile(str);
        return str;
    }

    public static boolean rotate() {
        NullPointerException th;
        boolean z;
        synchronized (tempFileLock) {
            ReentrantLock reentrantLock = writeFileLock;
            reentrantLock.lock();
            try {
                if (initialize()) {
                    FileChannel fileChannel = channel;
                    if (fileChannel != null) {
                        fileChannel.close();
                        channel = null;
                        File file = logFile;
                        File file2 = logTempFile;
                        if (file.exists()) {
                            int A00 = A00(file, file2);
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append(file2.getPath());
                            A0o.append(".");
                            try {
                                z = file.renameTo(AnonymousClass002.A0B(AnonymousClass000.A0h(A0o, A00 + 1)));
                            } catch (SecurityException unused) {
                            }
                            initialize();
                            reentrantLock.unlock();
                            return z;
                        }
                        z = false;
                        initialize();
                        reentrantLock.unlock();
                        return z;
                    }
                    th = new NullPointerException();
                    throw th;
                }
            } catch (IOException unused2) {
                channel = null;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
            reentrantLock.unlock();
            return false;
        }
    }

    public static String stackTraceStartPhrase() {
        StringBuilder A0l = AnonymousClass000.A0l("2.23.26.14");
        A0l.append("(");
        A0l.append(546598543);
        String A0e = AnonymousClass000.A0e(A0l);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("### begin stack trace ");
        A0o.append(A0e);
        return AnonymousClass000.A0X("\n", A0o);
    }

    public static void v(Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", getStackTraceString(th)));
        }
    }

    public static void w(String str) {
        C18310x6.A1L("LL_W ", str, level, 2);
    }

    public static int A00(File file, File file2) {
        int length;
        String name = file2.getName();
        int length2 = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i = 0;
        for (File name2 : listFiles) {
            String name3 = name2.getName();
            if (name3.startsWith(name) && length2 < (length = name3.length())) {
                try {
                    int parseInt = Integer.parseInt(name3.substring(length2, length));
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return i;
    }

    public static String adorn(String str, StringBuilder sb) {
        String str2;
        StringBuilder sb2;
        Thread currentThread = Thread.currentThread();
        long id = currentThread.getId();
        String name = currentThread.getName();
        StringBuilder A0l = AnonymousClass000.A0l(str);
        C64713Eq r0 = connectivityInfoProvider;
        if (r0 != null) {
            str2 = (String) r0.A00.get();
        } else {
            str2 = "D";
        }
        AnonymousClass0x2.A1N(A0l, str2);
        String obj = A0l.toString();
        if (level < 5) {
            int length = obj.length() + 20 + name.length() + 4;
            if (sb.length() > 16384) {
                sb2 = new StringBuilder(length + 16384 + 3);
                sb2.append(obj);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb.substring(0, 16384));
                sb2.append("...");
            } else {
                sb2 = new StringBuilder(length + sb.length());
                sb2.append(obj);
                sb2.append('[');
                sb2.append(id);
                sb2.append(':');
                sb2.append(name);
                sb2.append("] ");
                sb2.append(sb);
            }
            return sb2.toString();
        }
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        String str3 = "";
        String str4 = str3;
        int i = 5;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod()) {
                if (stackTraceElement.getFileName() != null) {
                    str3 = stackTraceElement.getFileName();
                    str4 = String.valueOf(stackTraceElement.getLineNumber());
                    break;
                }
                str4 = String.valueOf(stackTraceElement.getLineNumber());
                str3 = "(null)";
            } else if (i == 5) {
                str3 = stackTraceElement.getFileName();
                str4 = "native";
            }
            i++;
        }
        StringBuilder sb3 = new StringBuilder(obj.length() + 1 + 20 + 1 + name.length() + 1 + str3.length() + 1 + str4.length() + 1 + sb.length());
        sb3.append(obj);
        sb3.append('[');
        sb3.append(id);
        sb3.append(':');
        sb3.append(name);
        sb3.append(']');
        sb3.append(str3);
        sb3.append(':');
        sb3.append(str4);
        sb3.append(' ');
        sb3.append(sb);
        return sb3.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0100, code lost:
        if (r3.exists() == false) goto L_0x0113;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File compress() {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "log/compress/date "
            r1.append(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            X.C18260x0.A0m(r0, r1)
            java.lang.Object r16 = compressFileLock
            monitor-enter(r16)
            java.lang.Object r15 = tempFileLock     // Catch:{ all -> 0x0143 }
            monitor-enter(r15)     // Catch:{ all -> 0x0143 }
            r14 = 0
            java.io.File r0 = logFile     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r6 = logTempFile     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()     // Catch:{ IOException | SecurityException -> 0x0139 }
            int r4 = A00(r0, r6)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r3 = r0.getParent()     // Catch:{ IOException | SecurityException -> 0x0139 }
            r2 = 1
        L_0x0029:
            if (r2 > r4) goto L_0x0045
            java.lang.StringBuilder r1 = X.C18320x8.A0l(r6)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = "."
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r1 = X.C18330xA.A04(r3, r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r1.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0042
            r5.add(r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0042:
            int r2 = r2 + 1
            goto L_0x0029
        L_0x0045:
            java.util.Iterator r13 = r5.iterator()     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0049:
            boolean r0 = r13.hasNext()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x013d
            java.io.File r12 = X.AnonymousClass0x9.A0f(r13)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r2 = logFile     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r12.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x011a
            java.util.Date r1 = new java.util.Date     // Catch:{ IOException | SecurityException -> 0x0139 }
            r1.<init>()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = ".gz"
            java.lang.String r1 = X.AnonymousClass342.A00(r2, r0, r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r0 = r2.getParentFile()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r4 = X.AnonymousClass002.A0A(r0, r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.io.File r2 = r2.getParentFile()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = ".tmp"
            java.io.File r3 = X.C18270x1.A0A(r2, r0, r1)     // Catch:{ IOException | SecurityException -> 0x0139 }
            r0 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
            r6.<init>(r3, r0)     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00f2 }
            r7.<init>(r6)     // Catch:{ all -> 0x00f2 }
            r9 = 32768(0x8000, float:4.5918E-41)
            byte[] r8 = new byte[r9]     // Catch:{ all -> 0x00e8 }
            long r10 = r4.length()     // Catch:{ all -> 0x00e8 }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            java.io.FileInputStream r1 = X.AnonymousClass0x9.A0g(r4)     // Catch:{ all -> 0x00e8 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x00e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e8 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e8 }
            r5.<init>(r0)     // Catch:{ all -> 0x00e8 }
            r2 = 0
            int r1 = r5.read(r8, r2, r9)     // Catch:{ all -> 0x00de }
        L_0x00a9:
            r0 = -1
            if (r1 == r0) goto L_0x00b4
            r7.write(r8, r2, r1)     // Catch:{ all -> 0x00de }
            int r1 = r5.read(r8, r2, r9)     // Catch:{ all -> 0x00de }
            goto L_0x00a9
        L_0x00b4:
            r5.close()     // Catch:{ all -> 0x00e8 }
        L_0x00b7:
            java.io.BufferedInputStream r5 = X.AnonymousClass0x7.A0c(r12)     // Catch:{ all -> 0x00e8 }
            r2 = 0
            int r1 = r5.read(r8, r2, r9)     // Catch:{ all -> 0x00de }
        L_0x00c0:
            r0 = -1
            if (r1 == r0) goto L_0x00cb
            r7.write(r8, r2, r1)     // Catch:{ all -> 0x00de }
            int r1 = r5.read(r8, r2, r9)     // Catch:{ all -> 0x00de }
            goto L_0x00c0
        L_0x00cb:
            r5.close()     // Catch:{ all -> 0x00e8 }
            r7.close()     // Catch:{ all -> 0x00f2 }
            r3.renameTo(r4)     // Catch:{ all -> 0x00f2 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0113
            goto L_0x0102
        L_0x00de:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e8 }
        L_0x00e7:
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00ed }
            goto L_0x00f1
        L_0x00ed:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00f2 }
        L_0x00f1:
            throw r1     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fb
        L_0x00f7:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
        L_0x00fb:
            throw r1     // Catch:{ FileNotFoundException -> 0x00fc, all -> 0x0120 }
        L_0x00fc:
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0113
        L_0x0102:
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 != 0) goto L_0x0113
            r3.delete()     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0113:
            boolean r0 = r4.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            r14 = r4
            if (r0 != 0) goto L_0x011b
        L_0x011a:
            r14 = 0
        L_0x011b:
            r12.delete()     // Catch:{ IOException | SecurityException -> 0x0139 }
            goto L_0x0049
        L_0x0120:
            r2 = move-exception
            boolean r0 = r3.exists()     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException | SecurityException -> 0x0139 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | SecurityException -> 0x0139 }
            if (r0 != 0) goto L_0x0138
            r3.delete()     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0138:
            throw r2     // Catch:{ IOException | SecurityException -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0140 }
        L_0x013d:
            monitor-exit(r15)     // Catch:{ all -> 0x0140 }
            monitor-exit(r16)     // Catch:{ all -> 0x0143 }
            return r14
        L_0x0140:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0140 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.Log.compress():java.io.File");
    }

    public static void doLogToFile(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Calendar instance = Calendar.getInstance();
        A0o.append(instance.get(1));
        A0o.append('-');
        if (instance.get(2) < 9) {
            A0o.append('0');
        }
        A0o.append(instance.get(2) + 1);
        A0o.append('-');
        if (instance.get(5) < 10) {
            A0o.append('0');
        }
        A0o.append(instance.get(5));
        A0o.append(' ');
        if (instance.get(11) < 10) {
            A0o.append('0');
        }
        A0o.append(instance.get(11));
        A0o.append(':');
        if (instance.get(12) < 10) {
            A0o.append('0');
        }
        A0o.append(instance.get(12));
        A0o.append(':');
        if (instance.get(13) < 10) {
            A0o.append('0');
        }
        A0o.append(instance.get(13));
        A0o.append('.');
        if (instance.get(14) < 10) {
            A0o.append("00");
        } else if (instance.get(14) < 100) {
            A0o.append('0');
        }
        A0o.append(instance.get(14));
        A0o.append(' ');
        ReentrantLock reentrantLock = writeFileLock;
        reentrantLock.lock();
        try {
            if (initialize()) {
                FileChannel fileChannel = channel;
                if (fileChannel != null) {
                    fileChannel.position(fileChannel.size());
                    FileChannel fileChannel2 = channel;
                    CharsetEncoder charsetEncoder = DO_LOG_ENCODER;
                    ByteBuffer byteBuffer = DO_LOG_ENCODE_BUFFER;
                    encodeAndWriteToChannel(fileChannel2, charsetEncoder, byteBuffer, A0o);
                    encodeAndWriteToChannel(channel, charsetEncoder, byteBuffer, str);
                    encodeAndWriteToChannel(channel, charsetEncoder, byteBuffer, "\n");
                } else {
                    throw new NullPointerException();
                }
            }
        } catch (IOException e) {
            android.util.Log.e("WhatsApp", AnonymousClass000.A0V("IOException on ", str, AnonymousClass001.A0o()), e);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        reentrantLock.unlock();
    }

    public static void encodeAndWriteToChannel(FileChannel fileChannel, CharsetEncoder charsetEncoder, ByteBuffer byteBuffer, CharSequence charSequence) {
        CharBuffer wrap = CharBuffer.wrap(charSequence);
        charsetEncoder.reset();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        charsetEncoder.onMalformedInput(codingErrorAction);
        charsetEncoder.onUnmappableCharacter(codingErrorAction);
        byteBuffer.clear();
        CoderResult coderResult = CoderResult.OVERFLOW;
        while (coderResult.isOverflow()) {
            coderResult = charsetEncoder.encode(wrap, byteBuffer, true);
            byteBuffer.flip();
            if (coderResult.isError()) {
                coderResult.throwException();
            }
            fileChannel.write(byteBuffer);
            byteBuffer.clear();
        }
    }

    public static String log(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str3.length());
        sb.append(str2);
        sb.append("\n");
        sb.append(str3);
        String adorn = adorn(str, sb);
        logAdorned(adorn, false);
        return adorn;
    }

    public static void logToLogcat(int i, String str) {
        int length = str.length();
        if (length > 4000) {
            StringBuilder sb = new StringBuilder(4006);
            int i2 = 0;
            while (length - i2 > 4000) {
                if (i2 > 0) {
                    sb.append("...");
                }
                doLogToLogcat(i, AnonymousClass000.A0V(str.substring(i2, (i2 + 4000) - 3), "...", sb));
                i2 += 3997;
                sb.setLength(0);
            }
            StringBuilder sb2 = new StringBuilder(4006);
            if (i2 > 0) {
                sb2.append("...");
            }
            str = AnonymousClass000.A0X(str.substring(i2), sb2);
        }
        doLogToLogcat(i, str);
    }

    public static void a(String str) {
        log("LL_A ", str);
    }

    public static void d(String str, Throwable th) {
        String A0P = AnonymousClass000.A0P(th, "; exception=", AnonymousClass000.A0l(str));
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(4, log("LL_D ", A0P, stackTraceString));
        } else {
            log("LL_D ", A0P, stackTraceString);
        }
    }

    public static void e(String str, Throwable th) {
        String A0P = AnonymousClass000.A0P(th, "; exception=", AnonymousClass000.A0l(str));
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(1, log("LL_E ", A0P, stackTraceString));
        } else {
            log("LL_E ", A0P, stackTraceString);
        }
    }

    public static void i(String str, Throwable th) {
        String A0P = AnonymousClass000.A0P(th, "; exception=", AnonymousClass000.A0l(str));
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(3, log("LL_I ", A0P, stackTraceString));
        } else {
            log("LL_I ", A0P, stackTraceString);
        }
    }

    public static void log(int i, String str) {
        if (i <= level) {
            String log = log(getLogPrefix(i), str);
            if (level == 5) {
                logToLogcat(i, log);
            }
        }
    }

    public static void v(String str, Throwable th) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", AnonymousClass000.A0P(th, "; exception=", AnonymousClass000.A0l(str)), getStackTraceString(th)));
        }
    }

    public static void w(String str, Throwable th) {
        String A0P = AnonymousClass000.A0P(th, "; exception=", AnonymousClass000.A0l(str));
        int i = level;
        String stackTraceString = getStackTraceString(th);
        if (i == 5) {
            logToLogcat(2, log("LL_W ", A0P, stackTraceString));
        } else {
            log("LL_W ", A0P, stackTraceString);
        }
    }

    public static void d(Throwable th) {
        C18280x3.A1F("LL_D ", th, level, 4);
    }

    public static void e(Throwable th) {
        C18280x3.A1F("LL_E ", th, level, 1);
    }

    public static void i(Throwable th) {
        C18280x3.A1F("LL_I ", th, level, 3);
    }

    public static String log(String str, String str2) {
        String adorn = adorn(str, C18330xA.A0A(str2));
        logAdorned(adorn, false);
        return adorn;
    }

    public static void v(String str) {
        if (level >= 5) {
            logToLogcat(5, log("LL_V ", str));
        }
    }

    public static void w(Throwable th) {
        C18280x3.A1F("LL_W ", th, level, 2);
    }
}
