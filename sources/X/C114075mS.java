package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.whatsapp.superpack.WhatsAppObiInputStream;
import com.whatsapp.superpack.WhatsAppOpenboxArchive;
import java.io.IOException;

/* renamed from: X.5mS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C114075mS implements C182418oN {
    public final /* synthetic */ AnonymousClass5Y0 A00;

    public final Bitmap BJn(Resources resources, int i) {
        IllegalArgumentException th;
        WhatsAppObiInputStream whatsAppObiInputStream;
        AnonymousClass5Y0 r8 = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i > 0) {
            try {
                C156687h2 r4 = r8.A09;
                if (r8.A0B == null) {
                    synchronized (r8) {
                        try {
                            if (r8.A0B == null) {
                                r8.A0B = new WhatsAppOpenboxArchive(resources.getAssets().openFd("compressed/emojis/emojis.oba"));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                WhatsAppOpenboxArchive whatsAppOpenboxArchive = r8.A0B;
                int i2 = i - 1;
                if (i2 >= 0) {
                    whatsAppOpenboxArchive.ensureArchiveReaderInitialized();
                    whatsAppOpenboxArchive.ensureArchiveReaderInitialized();
                    if (i2 < WhatsAppOpenboxArchive.getFileCountNative(whatsAppOpenboxArchive.archiveReaderPtr)) {
                        long filePtrNative = WhatsAppOpenboxArchive.getFilePtrNative(whatsAppOpenboxArchive.archiveReaderPtr, i2);
                        long fileSizeNative = WhatsAppOpenboxArchive.getFileSizeNative(whatsAppOpenboxArchive.archiveReaderPtr, i2);
                        Bitmap bitmap = null;
                        if (filePtrNative <= 0 || fileSizeNative <= 0) {
                            th = new IllegalArgumentException();
                        } else {
                            try {
                                AnonymousClass7WO r10 = r4.A03;
                                long openRawBytesNative = WhatsAppObiInputStream.openRawBytesNative(filePtrNative, (int) fileSizeNative);
                                if (openRawBytesNative != 0) {
                                    whatsAppObiInputStream = new WhatsAppObiInputStream(openRawBytesNative, (byte[]) null);
                                    Bitmap A002 = C155127eK.A00(r10, whatsAppObiInputStream);
                                    whatsAppObiInputStream.close();
                                    bitmap = A002;
                                    Boolean bool = r8.A01;
                                    if (bool == null) {
                                        bool = C56952sp.A07(r8.A07, 3562);
                                        r8.A01 = bool;
                                    }
                                    if (!bool.booleanValue() || !r8.A00.A00()) {
                                        return bitmap;
                                    }
                                    C25661as r42 = new C25661as();
                                    r42.A05 = 13;
                                    r42.A08 = C18310x6.A0f(SystemClock.uptimeMillis(), uptimeMillis);
                                    r8.A08.BhE(r42, 100000);
                                    return bitmap;
                                }
                                throw AnonymousClass001.A0e("Failed to open OBI input stream");
                            } catch (IOException e) {
                                String obj = e.toString();
                                C94494rR r6 = new C94494rR();
                                r6.A02 = obj;
                                r6.A01 = "regular_emoji";
                                r4.A02.BhC(r6, C156687h2.A05);
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                    } else {
                        th = new IllegalArgumentException();
                    }
                } else {
                    th = new IllegalArgumentException();
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            th = new IllegalArgumentException();
        }
        throw th;
        throw th;
    }

    public /* synthetic */ C114075mS(AnonymousClass5Y0 r1) {
        this.A00 = r1;
    }
}
