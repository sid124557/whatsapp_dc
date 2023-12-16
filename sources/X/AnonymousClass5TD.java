package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5TD  reason: invalid class name */
public class AnonymousClass5TD {
    public final C106175Xx A00;
    public final C69263Wi A01;
    public final C620433g A02;
    public final C64773Ex A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final AnonymousClass306 A07;

    public C102385Iq A00(String str) {
        String str2 = null;
        AnonymousClass5QS r6 = new AnonymousClass5QS();
        try {
            Iterator it = C106325Yn.A00(str).iterator();
            while (it.hasNext()) {
                C106325Yn.A01(Arrays.asList(C106325Yn.A00.split(AnonymousClass001.A0m(it))), r6);
            }
            ArrayList A0s = AnonymousClass001.A0s();
            ArrayList A0s2 = AnonymousClass001.A0s();
            List<C149097La> list = r6.A02;
            int size = list.size();
            StringBuilder A0o = AnonymousClass001.A0o();
            if (size <= 257) {
                AnonymousClass000.A1H("contactpicker/contact array separation (size: ", A0o, list);
                AnonymousClass33M r7 = new AnonymousClass33M(AnonymousClass000.A0e(A0o));
                for (C149097La r9 : list) {
                    try {
                        C54292oU r8 = this.A05;
                        C64773Ex r2 = this.A03;
                        C620633i r0 = this.A04;
                        C620733j r62 = this.A06;
                        AnonymousClass5Y4 r1 = new AnonymousClass5Y4(r2, r0, r8, r62);
                        r1.A06(r9);
                        r1.A04(this.A02);
                        C106705a1 r22 = r1.A04;
                        try {
                            C42032Mn r02 = new C42032Mn(new C105755Wg(this.A00, r62).A01(r22), r22);
                            A0s2.add(r02);
                            A0s.add(r02.A00);
                        } catch (C143696zK e) {
                            Log.e((Throwable) new C376923q(e));
                            throw new C177558g4();
                        }
                    } catch (C143696zK e2) {
                        Log.e("Failed to generate VCard data, skip it.", e2);
                    }
                }
                r7.A07();
                if (A0s2.size() == 1) {
                    str2 = ((C42032Mn) A0s2.get(0)).A01.A03();
                }
                return new C102385Iq(str2, A0s, A0s2);
            }
            AnonymousClass000.A1H("Too many vCards for a contact array message: ", A0o, list);
            AnonymousClass0x2.A19(A0o);
            throw new C177568g5();
        } catch (C143696zK unused) {
            throw new C177578g6();
        }
    }

    public String A01(Uri uri) {
        IOException th;
        C140706uL r2;
        AnonymousClass5UR A0R = this.A04.A0R();
        if (A0R != null) {
            AnonymousClass306 r5 = this.A07;
            r5.A01(uri);
            try {
                ContentResolver A002 = AnonymousClass5UR.A00(A0R, uri);
                A0R.A01.A00(AnonymousClass58S.FILE, uri.getAuthority());
                AssetFileDescriptor openAssetFileDescriptor = A002.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    try {
                        r5.A02(openAssetFileDescriptor.getParcelFileDescriptor());
                        FileInputStream createInputStream = openAssetFileDescriptor.createInputStream();
                        try {
                            r2 = new C140706uL(createInputStream, 10000000);
                            String A003 = C624535b.A00(r2);
                            C626936e.A06(A003);
                            r2.close();
                            if (createInputStream != null) {
                                createInputStream.close();
                            }
                            openAssetFileDescriptor.close();
                            return A003;
                        } catch (Throwable th2) {
                            th = th2;
                            if (createInputStream != null) {
                                try {
                                    createInputStream.close();
                                } catch (Throwable th3) {
                                    th.addSuppressed(th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        if (openAssetFileDescriptor != null) {
                            openAssetFileDescriptor.close();
                        }
                        throw th4;
                    }
                } else {
                    th = AnonymousClass002.A0C(AnonymousClass000.A0P(uri, "Unable to open uri=", AnonymousClass001.A0o()));
                    throw th;
                }
            } catch (SecurityException e) {
                throw new IOException(e);
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
        } else {
            throw AnonymousClass002.A0C("Unable to open uri; cr=null");
        }
        throw th;
    }

    public void A02(C143696zK r8) {
        C69263Wi r1;
        int i;
        Log.e("vcardloader/exception", new C376923q(r8));
        if (r8 instanceof C177578g6) {
            r1 = this.A01;
            i = R.string.f11nameremoved;
        } else if (r8 instanceof C177568g5) {
            C69263Wi r5 = this.A01;
            C620733j r4 = this.A06;
            Object[] A0L = AnonymousClass002.A0L();
            AnonymousClass000.A1P(A0L, 257, 0);
            r5.A0P(r4.A0L(A0L, R.plurals.f9nameremoved, 257), 0);
            return;
        } else if (r8 instanceof C177558g4) {
            r1 = this.A01;
            i = R.string.f11nameremoved;
        } else {
            return;
        }
        r1.A0H(i, 0);
    }

    public AnonymousClass5TD(C106175Xx r1, C69263Wi r2, C620433g r3, C64773Ex r4, C620633i r5, C54292oU r6, C620733j r7, AnonymousClass306 r8) {
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A02 = r3;
    }
}
