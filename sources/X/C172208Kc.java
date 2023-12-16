package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: X.8Kc  reason: invalid class name and case insensitive filesystem */
public final class C172208Kc implements Closeable {
    public static final OutputStream A0E = new C140736uP();
    public static final Charset A0F = Charset.forName("US-ASCII");
    public static final Charset A0G = Charset.forName(DefaultCrypto.UTF_8);
    public static final Pattern A0H = Pattern.compile("[a-z0-9_-]{1,120}");
    public int A00;
    public long A01;
    public long A02 = 0;
    public long A03 = 0;
    public Writer A04;
    public final int A05;
    public final int A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final LinkedHashMap A0B = new LinkedHashMap(0, 0.75f, true);
    public final Callable A0C = new AnonymousClass91H(this, 0);
    public final ThreadPoolExecutor A0D = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C172208Kc(File file, long j) {
        this.A07 = file;
        this.A05 = 2;
        this.A08 = AnonymousClass002.A0A(file, "journal");
        this.A0A = AnonymousClass002.A0A(file, "journal.tmp");
        this.A09 = AnonymousClass002.A0A(file, "journal.bkp");
        this.A06 = 1;
        this.A01 = j;
    }

    public static /* synthetic */ void A00(C151057Tg r9, C172208Kc r10, boolean z) {
        IllegalStateException illegalStateException;
        synchronized (r10) {
            C151927Wv r7 = r9.A02;
            if (r7.A01 == r9) {
                if (z && !r7.A02) {
                    int i = 0;
                    while (true) {
                        if (i < r10.A06) {
                            if (!r9.A03[i]) {
                                r9.A00();
                                illegalStateException = C86604Kt.A0h("Newly created entry didn't create value for index ", AnonymousClass001.A0o(), i);
                                break;
                            } else if (!r7.A01().exists()) {
                                r9.A00();
                                break;
                            } else {
                                i = 1;
                            }
                        } else {
                            break;
                        }
                    }
                }
                for (int i2 = 0; i2 < r10.A06; i2 = 1) {
                    File A012 = r7.A01();
                    if (!z) {
                        A03(A012);
                    } else if (A012.exists()) {
                        File A002 = r7.A00();
                        A012.renameTo(A002);
                        long[] jArr = r7.A04;
                        long j = jArr[i2];
                        long length = A002.length();
                        jArr[i2] = length;
                        r10.A03 = (r10.A03 - j) + length;
                    }
                }
                r10.A00++;
                r7.A01 = null;
                if (r7.A02 || z) {
                    r7.A02 = true;
                    Writer writer = r10.A04;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("CLEAN ");
                    StringBuilder A0w = C18290x4.A0w(r7.A03, A0o);
                    for (long append : r7.A04) {
                        A0w.append(' ');
                        A0w.append(append);
                    }
                    AnonymousClass000.A1B(A0w, A0o);
                    AnonymousClass6C7.A12(writer, A0o);
                    if (z) {
                        long j2 = r10.A02;
                        r10.A02 = 1 + j2;
                        r7.A00 = j2;
                    }
                } else {
                    LinkedHashMap linkedHashMap = r10.A0B;
                    String str = r7.A03;
                    linkedHashMap.remove(str);
                    Writer writer2 = r10.A04;
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("REMOVE ");
                    A0o2.append(str);
                    AnonymousClass6C7.A12(writer2, A0o2);
                }
                r10.A04.flush();
                if (r10.A03 > r10.A01 || r10.A07()) {
                    r10.A0D.submit(r10.A0C);
                }
            } else {
                illegalStateException = AnonymousClass6CA.A0O();
            }
            throw illegalStateException;
        }
    }

    public final synchronized void A05() {
        Writer writer = this.A04;
        if (writer != null) {
            writer.close();
        }
        File file = this.A0A;
        FileOutputStream A0h = AnonymousClass0x9.A0h(file);
        Charset charset = A0F;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(A0h, charset));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.A05));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.A06));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            Iterator A10 = C18290x4.A10(this.A0B);
            while (A10.hasNext()) {
                C151927Wv r2 = (C151927Wv) A10.next();
                if (r2.A01 != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("DIRTY ");
                    A0o.append(r2.A03);
                    AnonymousClass6C7.A12(bufferedWriter, A0o);
                } else {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("CLEAN ");
                    StringBuilder A0w = C18290x4.A0w(r2.A03, A0o2);
                    for (long append : r2.A04) {
                        A0w.append(' ');
                        A0w.append(append);
                    }
                    AnonymousClass000.A1B(A0w, A0o2);
                    AnonymousClass6C7.A12(bufferedWriter, A0o2);
                }
            }
            bufferedWriter.close();
            File file2 = this.A08;
            if (file2.exists()) {
                File file3 = this.A09;
                A03(file3);
                if (!file2.renameTo(file3)) {
                    th = new IOException();
                    throw th;
                }
            }
            if (file.renameTo(file2)) {
                this.A09.delete();
                this.A04 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2, true), charset));
            } else {
                th = new IOException();
                throw th;
            }
        } catch (Throwable th) {
            th = th;
            bufferedWriter.close();
        }
    }

    public synchronized void A06(String str) {
        Throwable th;
        if (this.A04 != null) {
            A04(str);
            LinkedHashMap linkedHashMap = this.A0B;
            C151927Wv r7 = (C151927Wv) linkedHashMap.get(str);
            int i = 0;
            if (r7 != null) {
                if (r7.A01 == null) {
                    while (i < this.A06) {
                        File A002 = r7.A00();
                        if (!A002.exists() || A002.delete()) {
                            long j = this.A03;
                            long[] jArr = r7.A04;
                            this.A03 = j - jArr[i];
                            jArr[i] = 0;
                            i = 1;
                        } else {
                            th = AnonymousClass002.A0C(AnonymousClass000.A0P(A002, "failed to delete ", AnonymousClass001.A0o()));
                        }
                    }
                    this.A00++;
                    Writer writer = this.A04;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("REMOVE ");
                    A0o.append(str);
                    writer.append(AnonymousClass001.A0j(A0o, 10));
                    linkedHashMap.remove(str);
                    if (A07()) {
                        this.A0D.submit(this.A0C);
                    }
                }
            }
        } else {
            th = AnonymousClass001.A0e("cache is closed");
        }
        throw th;
    }

    public synchronized void close() {
        if (this.A04 != null) {
            LinkedHashMap linkedHashMap = this.A0B;
            Iterator A0u = AnonymousClass6C7.A0u(linkedHashMap.values());
            while (A0u.hasNext()) {
                C151057Tg r0 = ((C151927Wv) A0u.next()).A01;
                if (r0 != null) {
                    r0.A00();
                }
            }
            while (this.A03 > this.A01) {
                A06(C18310x6.A0q(AnonymousClass001.A0w(AnonymousClass001.A0u(linkedHashMap))));
            }
            this.A04.close();
            this.A04 = null;
        }
    }

    public static void A01(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static final void A04(String str) {
        if (!C18280x3.A1X(str, A0H)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            A0o.append(str);
            throw AnonymousClass000.A0F("\"", A0o);
        }
    }

    public final boolean A07() {
        int i = this.A00;
        if (i < 2000 || i < this.A0B.size()) {
            return false;
        }
        return true;
    }

    public static void A02(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A02(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw AnonymousClass002.A0C(AnonymousClass000.A0P(file2, "failed to delete file: ", AnonymousClass001.A0o()));
                }
            }
            return;
        }
        throw AnonymousClass002.A0C(AnonymousClass000.A0P(file, "not a readable directory: ", AnonymousClass001.A0o()));
    }

    public static void A03(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
