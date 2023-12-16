package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5Ul  reason: invalid class name */
public class AnonymousClass5Ul {
    public final C64393Dh A00;
    public final C69263Wi A01;
    public final C621033m A02;
    public final C56422rx A03;
    public final C620633i A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final C66543Lv A07;
    public final C29431io A08;
    public final AnonymousClass5Y0 A09;
    public final AnonymousClass1VX A0A;
    public final AnonymousClass4FV A0B;
    public final C54602oz A0C;
    public final C55972rD A0D;
    public final C988953q A0E;
    public final C56232re A0F;
    public final C48682fI A0G;
    public final C60152y5 A0H;
    public final AnonymousClass33O A0I;
    public final C107105ah A0J;
    public final C989053r A0K;
    public final AnonymousClass4FS A0L;
    public final AnonymousClass5TD A0M;
    public final C183538qC A0N;

    public final void A01(Context context, Uri uri, AnonymousClass4FU r19, C185388tZ r20, C108845de r21, File file, String str, List list, int i, boolean z) {
        try {
            A0A(r21, (C624134x) null, C633138t.A04, file, str, list, i, z, true, false);
            this.A01.A0S(new C70173a4(uri, 28, r20));
        } catch (IOException e) {
            this.A01.A0S(new C71593cM((Object) this, (Object) e, (Object) r19, (Object) context, 14));
        }
    }

    public final void A02(Context context, Uri uri, AnonymousClass4FU r16, C185388tZ r17, C108845de r18, File file, String str, List list, int i, boolean z) {
        try {
            C185388tZ r1 = r17;
            if (!A0A(r18, (C624134x) null, C633138t.A05, file, str, list, i, z, true, false)) {
                r1.BSk();
            }
            r1.Bf4(uri);
        } catch (IOException e) {
            this.A01.A0S(new C71593cM((Object) this, (Object) e, (Object) r16, (Object) context, 13));
        }
    }

    public void A07(C30471mV r4) {
        AnonymousClass33C r1 = r4.A01;
        if (!r4.A22() || !(r1 == null || r1.A0F == null)) {
            A08(r4, true, true);
        } else {
            ((C66423Lj) this.A0N.get()).A01(r4);
        }
        this.A08.A0C(r4, -1);
    }

    public boolean A09(C185388tZ r17, C108845de r18, C106985aV r19, C624134x r20, File file, String str, List list, int i, int i2, boolean z) {
        byte[] bArr;
        Log.i("sendmedia/sendmediafile - send video");
        AnonymousClass33C r5 = new AnonymousClass33C();
        File file2 = file;
        r5.A0F = file2;
        C106985aV r4 = r19;
        if (r19 == null) {
            bArr = C107085af.A04(file2);
        } else {
            Bitmap A012 = C107085af.A01(file2);
            if (A012 == null || (!A012.isMutable() && (A012 = A012.copy(Bitmap.Config.ARGB_8888, true)) == null)) {
                bArr = null;
            } else {
                r4.A07(A012, 0, false, false);
                bArr = C107085af.A03(A012, 100);
            }
            String str2 = r4.A03;
            if (str2 == null) {
                String A0U = C107655bf.A0U();
                r5.A0H = A0U;
                if (!r4.A0A(C107655bf.A0R(this.A00, A0U))) {
                    return false;
                }
            } else {
                r5.A0H = str2;
            }
        }
        this.A01.BkS(new C117535s5(r5, r17, this, r18, r20, str, list, bArr, i, i2, z));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(X.C108845de r25, X.C624134x r26, X.C633138t r27, java.io.File r28, java.lang.String r29, java.util.List r30, int r31, boolean r32, boolean r33, boolean r34) {
        /*
            r24 = this;
            r12 = 0
            r7 = r28
            if (r28 == 0) goto L_0x0057
            r4 = r24
            X.1VX r1 = r4.A0A
            X.33j r6 = r4.A06
            X.3Wi r3 = r4.A01
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaFileUtils/checkMediaFileSize src:"
            r2.append(r0)
            java.lang.String r0 = r7.getAbsolutePath()
            X.C18260x0.A1L(r2, r0)
            r0 = 3660(0xe4c, float:5.129E-42)
            int r2 = r1.A0N(r0)
            X.38t r0 = X.C633138t.A09
            r5 = r27
            if (r5 != r0) goto L_0x0059
            r0 = 542(0x21e, float:7.6E-43)
        L_0x002b:
            int r2 = r1.A0N(r0)
        L_0x002f:
            long r10 = r7.length()
            long r0 = (long) r2
            r8 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r8
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x007d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaFileUtils/checkMediaFileSize/too large:"
            java.lang.String r0 = X.AnonymousClass000.A0N(r7, r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r8 = 4
            X.3cT r0 = new X.3cT
            r9 = r32
            r4 = r0
            r5 = r3
            r7 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A0S(r0)
        L_0x0057:
            r0 = 0
            return r0
        L_0x0059:
            X.38t r0 = X.C633138t.A0g
            if (r5 != r0) goto L_0x0060
            r0 = 3185(0xc71, float:4.463E-42)
            goto L_0x002b
        L_0x0060:
            X.38t r0 = X.C633138t.A0V
            if (r5 != r0) goto L_0x0067
            r0 = 4155(0x103b, float:5.822E-42)
            goto L_0x002b
        L_0x0067:
            X.38t r0 = X.C633138t.A05
            if (r5 == r0) goto L_0x007a
            X.38t r0 = X.C633138t.A0O
            if (r5 == r0) goto L_0x007a
            X.38t r0 = X.C633138t.A04
            if (r5 == r0) goto L_0x0077
            X.38t r0 = X.C633138t.A0Q
            if (r5 != r0) goto L_0x002f
        L_0x0077:
            r0 = 3656(0xe48, float:5.123E-42)
            goto L_0x002b
        L_0x007a:
            r0 = 3657(0xe49, float:5.125E-42)
            goto L_0x002b
        L_0x007d:
            java.lang.String r0 = "SendMedia/sendMediaFile"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r33 != 0) goto L_0x00c9
            r1 = r7
        L_0x0085:
            X.33C r13 = new X.33C
            r13.<init>()
            r13.A0F = r1
            boolean r0 = X.AnonymousClass36O.A08(r5)
            if (r0 == 0) goto L_0x00c7
            byte[] r2 = X.C107085af.A04(r1)
            if (r2 != 0) goto L_0x009d
            java.lang.String r0 = "SendMedia/sendMediaFile no video thumbnail generated"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x009d:
            X.2rD r11 = r4.A0D
            byte r0 = r5.A00
            r21 = 0
            r19 = r12
            r14 = r25
            r15 = r26
            r16 = r29
            r17 = r30
            r23 = r34
            r18 = r12
            r22 = r21
            r20 = r0
            X.30M r1 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r31
            r1.A00 = r0
            X.8Mj r0 = new X.8Mj
            r0.<init>((X.AnonymousClass30M) r1, (X.AnonymousClass5Ul) r4, (byte[]) r2)
            r3.A0S(r0)
            r0 = 1
            return r0
        L_0x00c7:
            r2 = 0
            goto L_0x009d
        L_0x00c9:
            X.3Dh r2 = r4.A00
            X.2y5 r1 = r4.A0H
            r0 = 0
            java.io.File r1 = X.C107655bf.A0P(r2, r1, r5, r7, r0)
            java.lang.String r0 = "SendMedia/sendMediaFile - sending hidden file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A0a(r7, r1)
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ul.A0A(X.5de, X.34x, X.38t, java.io.File, java.lang.String, java.util.List, int, boolean, boolean, boolean):boolean");
    }

    public AnonymousClass2IK A00(Uri uri, Uri uri2, C181618n3 r25, C108845de r26, AnonymousClass65N r27, C624134x r28, Integer num, String str, List list, List list2, List list3, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Uri uri3 = uri;
        Bitmap A0B2 = this.A0K.A0B(uri3, 100, 100);
        byte[] A1Y = C18320x8.A1Y(A0B2, new ByteArrayOutputStream());
        A0B2.recycle();
        C55972rD r3 = this.A0D;
        AnonymousClass33C r5 = new AnonymousClass33C();
        byte b = 1;
        if (z3) {
            b = 42;
        }
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        C624134x r7 = r28;
        C108845de r6 = r26;
        String str2 = str;
        AnonymousClass30M A002 = r3.A00(uri3, r5, r6, r7, str2, list6, list5, list4, b, i, i2, z);
        A002.A00 = i3;
        C181618n3 r32 = r25;
        if (r25 != null) {
            Iterator A0x = AnonymousClass0x7.A0x(A002.A02);
            while (A0x.hasNext()) {
                r32.BhV(uri2, C18300x5.A0T(A0x));
            }
        }
        return this.A02.A02(A002, r27, (C30471mV) null, num, A1Y, z2, z4, z5);
    }

    public AnonymousClass5Ul(C64393Dh r2, C69263Wi r3, C621033m r4, C56422rx r5, C620633i r6, C54292oU r7, C620733j r8, C66543Lv r9, C29431io r10, AnonymousClass5Y0 r11, AnonymousClass1VX r12, AnonymousClass4FV r13, C54602oz r14, C55972rD r15, C988953q r16, C56232re r17, C48682fI r18, C60152y5 r19, AnonymousClass33O r20, C107105ah r21, C989053r r22, AnonymousClass4FS r23, AnonymousClass5TD r24, C183538qC r25) {
        this.A0A = r12;
        this.A01 = r3;
        this.A05 = r7;
        this.A0L = r23;
        this.A00 = r2;
        this.A0B = r13;
        this.A09 = r11;
        this.A02 = r4;
        this.A0M = r24;
        this.A0D = r15;
        this.A0G = r18;
        this.A0J = r21;
        this.A0K = r22;
        this.A04 = r6;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A0E = r16;
        this.A0N = r25;
        this.A03 = r5;
        this.A0I = r20;
        this.A0C = r14;
        this.A0F = r17;
        this.A0H = r19;
    }

    public void A04(Uri uri, AnonymousClass4FU r24, C624134x r25, File file, String str, List list, List list2, int i, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendmedia/send-document jids: ");
        List list3 = list;
        C18260x0.A1L(A0o, Arrays.deepToString(list3.toArray()));
        AnonymousClass4FS r0 = this.A0L;
        AnonymousClass1VX r10 = this.A0A;
        C69263Wi r5 = this.A01;
        C54292oU r8 = this.A05;
        C64393Dh r4 = this.A00;
        AnonymousClass4FV r11 = this.A0B;
        Uri uri2 = uri;
        AnonymousClass4FU r3 = r24;
        C18270x1.A0w(new C992855d(uri2, r3, r4, r5, this.A02, this.A04, r8, this.A06, r10, r11, this.A0D, r25, this.A0J, this.A0K, file, str, list3, list2, i, z), r0);
    }

    public final void A05(AnonymousClass4FU r13, C185388tZ r14, ArrayList arrayList, List list) {
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri A0c = C86664Kz.A0c(it);
            A04(A0c, r13, (C624134x) null, (File) null, (String) null, list, (List) null, size, false);
            r14.Bf4(A0c);
        }
    }

    public void A06(AnonymousClass30M r12, boolean z, boolean z2) {
        boolean A1T;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass30M r7 = r12;
        CopyOnWriteArrayList copyOnWriteArrayList = r12.A02;
        Iterator A0x = AnonymousClass0x7.A0x(copyOnWriteArrayList);
        while (true) {
            if (!A0x.hasNext()) {
                break;
            }
            C624134x A0T = C18300x5.A0T(A0x);
            C56232re r1 = this.A0F;
            if ((A0T instanceof C30471mV) && C86654Ky.A0a(r1, (C30471mV) A0T) != null) {
                A0s.add(A0T);
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C624134x A0T2 = C18300x5.A0T(it);
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass2z0 A082 = C624134x.A08(A0T2, "sendmedia/retrymediaupload/already-uploading ", A0o);
            C18260x0.A0o(A082, A0o);
            r12.A03(A082);
        }
        synchronized (r7) {
            A1T = AnonymousClass000.A1T(copyOnWriteArrayList.size());
        }
        if (A1T) {
            Log.i("sendmedia/retrymediaupload/nothing-to-upload");
        } else {
            this.A0L.BkM(new C71423c5(this, r7, 0, z, z2));
        }
    }

    public void A08(C30471mV r3, boolean z, boolean z2) {
        AnonymousClass33C A002 = C30471mV.A00(r3);
        if (z && !A002.A0M) {
            A002.A0M = true;
            this.A07.A0b(r3, -1);
        }
        A06(new AnonymousClass30M(Collections.singletonList(r3)), z, z2);
    }

    public void A03(Context context, AnonymousClass4FU r33, C185388tZ r34, C108845de r35, String str, List list, List list2, int i, boolean z, boolean z2) {
        AnonymousClass4FU r8;
        C185388tZ r6;
        C108845de r15;
        String str2;
        List list3;
        Uri A0c;
        C69263Wi r1;
        int i2;
        Context context2 = context;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("sendmedia/sendmedia/size=");
        C18260x0.A1G(A0o, list2.size());
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int size = list2.size();
        Iterator it = list2.iterator();
        while (true) {
            r8 = r33;
            r6 = r34;
            r15 = r35;
            str2 = str;
            list3 = list;
            if (!it.hasNext()) {
                break;
            }
            A0c = C86664Kz.A0c(it);
            byte A002 = this.A0E.A00(A0c);
            int i3 = i;
            if (A002 != 1) {
                boolean z3 = z;
                if (A002 != 2) {
                    if (A002 != 3) {
                        if (A002 == 4) {
                            this.A0L.BkM(new C172708Mj(this, A0c, list3, 19));
                        } else if (A002 != 9) {
                            if (A002 == 13) {
                                if (z2) {
                                    this.A0K.A0H(A0c, r8, new AnonymousClass6AW(context2, A0c, r8, r6, this, r15, str2, list3, size, 1, z3));
                                }
                            }
                        } else if (AnonymousClass000.A1W(C627336j.A03(list3))) {
                            Log.e("sendmedia/senddocument/error: Trying to share a document to status");
                            this.A01.A0H(R.string.f11nameremoved, 0);
                        } else {
                            A0s2.add(A0c);
                        }
                    } else if (z2) {
                        this.A0K.A0H(A0c, r8, new C116295q3(context2, A0c, r8, r6, this, r15, str2, list3, i3, size));
                    }
                    A0s.add(A0c);
                } else {
                    this.A0K.A0H(A0c, r8, new AnonymousClass6AW(context2, A0c, r8, r6, this, r15, str2, list3, size, 0, z3));
                }
            } else if (z2) {
                try {
                    A00(A0c, (Uri) null, (C181618n3) null, r15, (AnonymousClass65N) null, (C624134x) null, (Integer) null, str2, list3, this.A0G.A00(A0c.getQueryParameter("mentions")), (List) null, i3, 0, size, false, false, false, false, false);
                } catch (IOException e) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e);
                    if (e.getMessage() == null || !C86624Kv.A1Z(e)) {
                        this.A01.A0H(R.string.f11nameremoved, 0);
                    } else {
                        r1 = this.A01;
                        i2 = R.string.f11nameremoved;
                    }
                } catch (C1000259c e2) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e2);
                    r1 = this.A01;
                    i2 = R.string.f11nameremoved;
                } catch (OutOfMemoryError e3) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e3);
                    r1 = this.A01;
                    i2 = R.string.f11nameremoved;
                } catch (SecurityException e4) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e4);
                    r1 = this.A01;
                    i2 = R.string.f11nameremoved;
                }
                r6.Bf4(A0c);
            } else {
                A0s.add(A0c);
            }
        }
        if (!A0s.isEmpty()) {
            A05(r8, r6, A0s2, list3);
            AnonymousClass5PE r2 = new AnonymousClass5PE(context2);
            r2.A0G = A0s;
            r2.A0E = str2;
            r2.A0F = C627336j.A0A(list3);
            r2.A02 = 5;
            r2.A0K = true;
            if (list3.size() > 1) {
                r2.A0O = true;
            }
            if (AnonymousClass000.A1W(C627336j.A03(list3))) {
                r2.A09 = r15;
            }
            context2.startActivity(r2.A01());
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                r6.Bf3(C86664Kz.A0c(it2));
            }
            return;
        } else if (!A0s2.isEmpty()) {
            C56422rx r10 = this.A03;
            int size2 = A0s2.size();
            C18270x1.A10(r10, 0, list3);
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (!AnonymousClass5b1.A05(r10, C18300x5.A0P(it3), size2)) {
                    A05(r8, r6, A0s2, list3);
                    return;
                }
            }
            Uri uri = (Uri) A0s2.get(0);
            Intent putExtra = C18320x8.A07().setClassName(context2.getPackageName(), "com.whatsapp.documentpicker.DocumentPreviewActivity").putExtra("jids", C627336j.A0A(list3)).putExtra("uri", uri).putExtra("send", true ^ r6.AyS());
            if (context2 instanceof Activity) {
                ((Activity) context2).startActivityForResult(putExtra, 36);
            }
            r6.Bf3(uri);
            return;
        } else if (list3.size() > 1) {
            context2.startActivity(C627736r.A02(context2));
            return;
        } else {
            return;
        }
        r1.A0F(i2, 0);
        r6.Bf4(A0c);
    }
}
