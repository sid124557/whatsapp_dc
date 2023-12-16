package X;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.os.Process;
import android.provider.ContactsContract;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: X.55u  reason: invalid class name and case insensitive filesystem */
public class C994555u extends C173778Rq {
    public final C69263Wi A00;
    public final C64773Ex A01;
    public final AnonymousClass7DX A02;
    public final C613330g A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final boolean A07;
    public volatile boolean A08;

    public void run() {
        Bitmap bitmap;
        Bitmap A002;
        long j;
        Process.setThreadPriority(10);
        while (true) {
            if (!this.A08) {
                Stack stack = this.A02.A00;
                if (stack.isEmpty()) {
                    synchronized (stack) {
                        try {
                            if (this.A07) {
                                j = 15000;
                            } else {
                                j = 0;
                            }
                            stack.wait(j);
                        } catch (Throwable th) {
                            while (true) {
                                th = th;
                                break;
                            }
                        }
                    }
                }
                try {
                    if (this.A08) {
                        return;
                    }
                    if (!stack.isEmpty()) {
                        synchronized (stack) {
                            try {
                                if (!stack.isEmpty()) {
                                    AnonymousClass5KA r3 = (AnonymousClass5KA) stack.pop();
                                    if (r3 != null) {
                                        Object obj = r3.A01;
                                        if (obj instanceof C104215Qc) {
                                            C104215Qc r6 = (C104215Qc) obj;
                                            ImageView imageView = r3.A04;
                                            Object obj2 = r3.A05;
                                            C184288rY r13 = r3.A00;
                                            int i = r3.A03;
                                            float f = r3.A02;
                                            if (imageView.getTag() != null && imageView.getTag().equals(obj2)) {
                                                int height = imageView.getHeight();
                                                if (height <= 0) {
                                                    height = C18290x4.A0G(imageView).getDimensionPixelSize(R.dimen.f6nameremoved);
                                                }
                                                C54292oU r1 = this.A05;
                                                C64773Ex r10 = this.A01;
                                                C620633i r9 = this.A04;
                                                AnonymousClass5Y4 r11 = new AnonymousClass5Y4(r10, r9, r1, this.A06);
                                                long j2 = r6.A04;
                                                Iterator A0v = AnonymousClass001.A0v(r11.A02(Long.valueOf(j2).toString()));
                                                while (true) {
                                                    if (A0v.hasNext()) {
                                                        AnonymousClass3ZH A072 = r10.A07(C18300x5.A0P(A0v));
                                                        if (A072 != null) {
                                                            r6.A01 = A072;
                                                            bitmap = this.A03.A03(imageView.getContext(), A072, f, i, true);
                                                            break;
                                                        }
                                                    } else {
                                                        AnonymousClass5UR A0R = r9.A0R();
                                                        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(A0R.A00, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j2));
                                                        bitmap = null;
                                                        if (!(openContactPhotoInputStream == null || (A002 = C613330g.A00(new AnonymousClass760(openContactPhotoInputStream, 1))) == null)) {
                                                            bitmap = C107655bf.A0H(A002, -1.0f, height);
                                                        }
                                                        r6.A00 = bitmap;
                                                        if (bitmap != null) {
                                                        }
                                                    }
                                                }
                                                this.A00.A0S(new C71453c8(bitmap, imageView, r13, obj2, this, 5));
                                            }
                                        }
                                        if (obj instanceof AnonymousClass3ZH) {
                                            ImageView imageView2 = r3.A04;
                                            Object obj3 = r3.A05;
                                            C184288rY r132 = r3.A00;
                                            int i2 = r3.A03;
                                            this.A00.A0S(new C71453c8(this.A03.A03(imageView2.getContext(), (AnonymousClass3ZH) obj, r3.A02, i2, true), imageView2, r132, obj3, this, 5));
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                while (true) {
                                    th = th2;
                                    break;
                                }
                            }
                        }
                    } else if (this.A07) {
                        synchronized (stack) {
                            try {
                                if (stack.isEmpty()) {
                                    this.A08 = true;
                                    return;
                                }
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                }
                                throw th;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (InterruptedException unused) {
                    Log.e("ContactPhotos/interrupted exception/allow thread to exit");
                    return;
                }
            } else {
                return;
            }
        }
        throw th;
    }

    public C994555u(C69263Wi r3, C64773Ex r4, AnonymousClass7DX r5, C613330g r6, C620633i r7, C54292oU r8, C620733j r9, String str, boolean z) {
        super(AnonymousClass000.A0V("contact-photos-", str, AnonymousClass001.A0o()));
        this.A05 = r8;
        this.A06 = r9;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = z;
    }
}
