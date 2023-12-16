package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.5Uq  reason: invalid class name and case insensitive filesystem */
public class C105365Uq {
    public C994555u A00;
    public final float A01;
    public final int A02;
    public final AnonymousClass7DX A03 = new AnonymousClass7DX();
    public final String A04;
    public final boolean A05;
    public final /* synthetic */ C114015mM A06;

    public void A03(ImageView imageView, C104215Qc r13) {
        C104215Qc r7 = r13;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r13.A06);
        String obj = Long.valueOf(r13.A04).toString();
        imageView.setTag(obj);
        Bitmap bitmap = r13.A00;
        if (bitmap != null) {
            imageView.getDrawable();
            imageView.setImageBitmap(bitmap);
            return;
        }
        AnonymousClass3ZH r0 = r13.A01;
        if (r0 != null) {
            A08(imageView, r0);
            return;
        }
        C114015mM r02 = this.A06;
        A06(imageView2, new C112775kH(r02.A02, (AnonymousClass3ZH) null, r02.A0B, r02.A0C), r7, obj, this.A01, this.A02);
    }

    public final void A04(ImageView imageView, C184288rY r12, AnonymousClass3ZH r13, float f, int i, boolean z) {
        String A0H;
        int i2 = i;
        if (i < 0 || i > 10000) {
            Log.e("contactPhotos/attempting to display invalid size, did you pass a resource ID?");
        }
        ImageView imageView2 = imageView;
        AnonymousClass3ZH r6 = r13;
        if (z) {
            C114015mM r1 = this.A06;
            if (C56972sr.A08(r1.A01, r13)) {
                A0H = imageView.getContext().getString(R.string.f11nameremoved);
            } else {
                A0H = r1.A04.A0H(r13);
            }
            imageView.setContentDescription(A0H);
        }
        float f2 = f;
        String A0M = r13.A0M(f, i);
        boolean equals = A0M.equals(imageView.getTag());
        imageView.setTag(A0M);
        Bitmap bitmap = (Bitmap) this.A06.A05.A02.A01().A06(A0M);
        C184288rY r5 = r12;
        if (bitmap != null) {
            if (r13.A0U()) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("contactPhotos/displaying from cache instead of fetching from server/jid = ");
                C18260x0.A0o(r13.A0H, A0o);
            }
            r12.Bog(bitmap, imageView, true);
            return;
        }
        if (!equals || !r13.A0g) {
            if (r13.A0U()) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("contactPhotos/contact does not have photo, so show placeholder/jid = ");
                C18260x0.A0o(r13.A0H, A0o2);
            }
            r12.Bp2(imageView);
        }
        if (r13.A0g) {
            A06(imageView2, r5, r6, A0M, f2, i2);
        }
    }

    public void A05(ImageView imageView, C184288rY r12, AnonymousClass3ZH r13, boolean z) {
        AnonymousClass3ZH r6 = r13;
        GroupJid A1C = C86664Kz.A1C(r13);
        float f = this.A01;
        C114015mM r0 = this.A06;
        if (r0.A0C.A03(r0.A0A.A06(A1C))) {
            f = -2.14748365E9f;
        }
        A04(imageView, r12, r6, f, this.A02, z);
    }

    public final void A06(ImageView imageView, C184288rY r14, Object obj, Object obj2, float f, int i) {
        A01(imageView);
        AnonymousClass5KA r2 = new AnonymousClass5KA(imageView, r14, obj, obj2, f, i);
        AnonymousClass7DX r5 = this.A03;
        Stack stack = r5.A00;
        synchronized (stack) {
            stack.add(0, r2);
            stack.notifyAll();
            C994555u r22 = this.A00;
            if (r22 == null || (this.A05 && r22.A08)) {
                String str = this.A04;
                C114015mM r0 = this.A06;
                C994555u r23 = new C994555u(r0.A00, r0.A03, r5, r0.A06, r0.A07, r0.A08, r0.A09, str, this.A05);
                this.A00 = r23;
                r23.start();
            }
        }
    }

    public void A09(ImageView imageView, AnonymousClass3ZH r13, int i, boolean z) {
        AnonymousClass3ZH r7 = r13;
        GroupJid A1C = C86664Kz.A1C(r13);
        float f = this.A01;
        C114015mM r3 = this.A06;
        C56072rN r2 = r3.A0C;
        if (r2.A03(r3.A0A.A06(A1C))) {
            f = -2.14748365E9f;
        }
        A04(imageView, new C112775kH(r3.A02, r13, r3.A0B, r2), r7, f, i, z);
    }

    public void A0B(ImageView imageView, C106705a1 r12) {
        C114015mM r0 = this.A06;
        ImageView imageView2 = imageView;
        C106705a1 r7 = r12;
        A07(imageView2, new C112775kH(r0.A02, (AnonymousClass3ZH) null, r0.A0B, r0.A0C), r7, this.A01, this.A02);
    }

    public C105365Uq(C114015mM r2, String str, float f, int i, boolean z) {
        this.A06 = r2;
        this.A02 = i;
        this.A01 = f;
        this.A04 = str;
        this.A05 = z;
    }

    public void A00() {
        C994555u r1 = this.A00;
        if (r1 != null) {
            r1.A08 = true;
            r1.interrupt();
            this.A00 = null;
        }
    }

    public void A01(ImageView imageView) {
        Stack stack = this.A03.A00;
        synchronized (stack) {
            int i = 0;
            while (i < stack.size()) {
                if (((AnonymousClass5KA) stack.get(i)).A04 == imageView) {
                    stack.remove(i);
                } else {
                    i++;
                }
            }
        }
    }

    public void A02(ImageView imageView, C15810ry r3, AnonymousClass3ZH r4, int i) {
        if (r4 == null) {
            imageView.setImageDrawable((Drawable) r3.get());
        } else {
            A09(imageView, r4, i, true);
        }
    }

    public void A08(ImageView imageView, AnonymousClass3ZH r3) {
        if (imageView != null) {
            A0A(imageView, r3, true);
        }
    }

    public void A0A(ImageView imageView, AnonymousClass3ZH r6, boolean z) {
        C114015mM r0 = this.A06;
        A05(imageView, new C112775kH(r0.A02, r6, r0.A0B, r0.A0C), r6, z);
    }

    public void A07(ImageView imageView, C184288rY r13, C106705a1 r14, float f, int i) {
        int length;
        ImageView imageView2 = imageView;
        imageView.setContentDescription(r14.A03());
        ArrayList A0s = AnonymousClass001.A0s();
        List list = r14.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UserJid userJid = AnonymousClass4L0.A0R(it).A01;
                if (userJid != null) {
                    A0s.add(userJid);
                }
            }
        }
        Iterator it2 = A0s.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C95814uZ A0P = C18300x5.A0P(it2);
            if (A0P instanceof PhoneUserJid) {
                C114015mM r1 = this.A06;
                AnonymousClass3ZH A07 = r1.A03.A07(A0P);
                if (A07 != null) {
                    A04(imageView2, new C112775kH(r1.A02, (AnonymousClass3ZH) null, r1.A0B, r1.A0C), A07, f, i, true);
                    return;
                }
            }
        }
        byte[] bArr = r14.A0B;
        if (bArr == null || (length = bArr.length) <= 0) {
            r13.Bp2(imageView);
        } else {
            r13.Bog(BitmapFactory.decodeByteArray(bArr, 0, length), imageView, true);
        }
    }
}
