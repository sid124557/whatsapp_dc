package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.30R  reason: invalid class name */
public class AnonymousClass30R {
    public static final Bitmap A07 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public C172228Ke A00;
    public boolean A01 = false;
    public final long A02;
    public final C04840Qw A03;
    public final AnonymousClass5QA A04;
    public final File A05;
    public final Object A06 = AnonymousClass002.A0D();

    public Bitmap A00(String str) {
        Bitmap bitmap = (Bitmap) this.A03.A04(str);
        if (bitmap != null && this.A01) {
            this.A04.A01(bitmap.getWidth(), bitmap.getHeight(), str);
        }
        return bitmap;
    }

    public final void A02() {
        synchronized (this.A06) {
            C172228Ke r0 = this.A00;
            if (r0 == null || r0.A03 == null) {
                File file = this.A05;
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "bitmapcache/initDiskCache: unable to create cache dir ", file);
                }
                long usableSpace = file.getUsableSpace();
                long j = this.A02;
                if (usableSpace > j) {
                    try {
                        this.A00 = C172228Ke.A00((AnonymousClass7EN) null, file, j);
                    } catch (IOException e) {
                        Log.e("bitmapcache/initDiskCache ", e);
                    }
                }
            }
        }
    }

    public void A03(Bitmap bitmap, String str) {
        C04840Qw r1 = this.A03;
        synchronized (r1) {
            r1.A08(str, bitmap);
            r1.A01();
            r1.A00();
        }
    }

    public void A05(boolean z) {
        C04840Qw r1 = this.A03;
        synchronized (r1) {
            r1.A07(-1);
        }
        synchronized (this.A06) {
            C172228Ke r0 = this.A00;
            if (r0 != null) {
                if (z) {
                    try {
                        r0.close();
                        C172228Ke.A04(r0.A08);
                    } catch (IOException e) {
                        Log.e("bitmapcache/close ", e);
                    }
                }
                C172228Ke r12 = this.A00;
                if (r12.A03 != null) {
                    r12.close();
                }
                this.A00 = null;
            }
        }
    }

    public AnonymousClass30R(File file, long j) {
        this.A05 = file;
        this.A02 = j;
        C85624Gz r1 = new C85624Gz(this, (int) (C58152un.A00 / 8192));
        this.A03 = r1;
        this.A04 = new AnonymousClass5QA(r1);
    }

    public Bitmap A01(String str, int i, int i2, boolean z) {
        Bitmap bitmap;
        AnonymousClass8KP r0;
        Bitmap bitmap2;
        A02();
        synchronized (this.A06) {
            C172228Ke r02 = this.A00;
            bitmap = null;
            if (r02 != null) {
                try {
                    r0 = r02.A09(str);
                } catch (IOException unused) {
                    Log.e("bitmapcache/journal corrupted");
                    r0 = null;
                }
                if (r0 != null) {
                    try {
                        InputStream inputStream = r0.A00[0];
                        if (inputStream != null) {
                            if (z) {
                                try {
                                    bitmap2 = C107245ax.A04(this.A04, new AnonymousClass5WB(i, i2), inputStream, true).A02;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } else {
                                bitmap2 = C107245ax.A04((AnonymousClass5QA) null, new AnonymousClass5WB(i, i2), inputStream, false).A02;
                            }
                            if (bitmap2 == null) {
                                try {
                                    Log.e("bitmapcache/decode failed");
                                    try {
                                        inputStream.close();
                                    } catch (IOException e) {
                                        e = e;
                                        bitmap = bitmap2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bitmap = bitmap2;
                                    inputStream.close();
                                    throw th;
                                }
                            } else {
                                bitmap = bitmap2;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        C18260x0.A1Q(AnonymousClass001.A0o(), "bitmapcache/ IO exception on diskcache: ", e);
                        return bitmap;
                    }
                }
            }
        }
        return bitmap;
    }

    /* JADX INFO: finally extract failed */
    public void A04(InputStream inputStream, String str) {
        OutputStream A002;
        A02();
        synchronized (this.A06) {
            C172228Ke r0 = this.A00;
            if (r0 != null) {
                try {
                    AnonymousClass8KP A09 = r0.A09(str);
                    if (A09 == null) {
                        AnonymousClass7WJ A08 = this.A00.A08(str);
                        if (A08 != null) {
                            A002 = A08.A00();
                            C627536m.A0I(inputStream, A002);
                            A08.A01();
                            A002.close();
                        }
                    } else {
                        A09.A00[0].close();
                    }
                    this.A00.A07();
                } catch (Exception e) {
                    try {
                        Log.e("bitmapcache/download ", e);
                        this.A00.A07();
                    } catch (Throwable th) {
                        this.A00.A07();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        return;
        throw th;
    }
}
