package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.55d  reason: invalid class name and case insensitive filesystem */
public class C992855d extends AnonymousClass5ZM {
    public final int A00;
    public final Uri A01;
    public final C64393Dh A02;
    public final C69263Wi A03;
    public final C621033m A04;
    public final C620633i A05;
    public final C54292oU A06;
    public final C620733j A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass4FV A09;
    public final C55972rD A0A;
    public final C624134x A0B;
    public final C107105ah A0C;
    public final C989053r A0D;
    public final File A0E;
    public final String A0F;
    public final WeakReference A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Integer num;
        File file;
        String str;
        int i;
        C620633i r2 = this.A05;
        Uri uri = this.A01;
        String A0W = C107655bf.A0W(uri, r2.A0R());
        try {
            C107105ah r19 = this.A0C;
            AnonymousClass1VX r15 = this.A08;
            C64393Dh r11 = this.A02;
            AnonymousClass4FV r14 = this.A09;
            C55972rD r20 = this.A0A;
            C989053r r3 = this.A0D;
            List list = this.A0H;
            File file2 = this.A0E;
            C624134x r22 = this.A0B;
            boolean z = this.A0J;
            String str2 = this.A0F;
            List list2 = this.A0I;
            int i2 = this.A00;
            boolean A1U = C18270x1.A1U(r15, r11);
            C18260x0.A0a(r14, r20, r3, 2);
            C18260x0.A0U(list, uri);
            C162457s7.A0J(A0W, 9);
            if (file2 == null) {
                file2 = r3.A0E(uri);
                C162457s7.A0D(file2);
            }
            long length = file2.length();
            String A0V = C107655bf.A0V(uri);
            AnonymousClass5b1 r17 = C107105ah.A04;
            String A022 = AnonymousClass5b1.A02(uri, r2);
            if (A022 != null && (A0V == null || A0V.length() == 0)) {
                A0V = C627536m.A08(A022);
            }
            C24391Xf r9 = new C24391Xf();
            r9.A00 = Double.valueOf(Math.ceil(((double) length) / ((double) 20000000)) * ((double) 20) * ((double) SearchActionVerificationClientService.MS_TO_NS));
            if (A0V == null || A0V.length() == 0) {
                num = null;
            } else {
                String A0g = C18320x8.A0g(Locale.ROOT, A0V);
                if (C107105ah.A0A.contains(A0g)) {
                    i = 2;
                } else if (C107105ah.A0C.contains(A0g)) {
                    i = 3;
                } else if (C107105ah.A06.contains(A0g)) {
                    i = 4;
                } else if (C107105ah.A08.contains(A0g)) {
                    i = 5;
                } else if (C107105ah.A07.contains(A0g)) {
                    i = 6;
                } else if (C107105ah.A09.contains(A0g)) {
                    i = 7;
                } else if (C107105ah.A0B.contains(A0g)) {
                    i = 8;
                } else {
                    num = Integer.valueOf(A1U);
                }
                num = Integer.valueOf(i);
            }
            r9.A01 = num;
            if (length <= C86624Kv.A05(r15, 542)) {
                r14.BhD(r9);
                byte[] A042 = r19.A04(file2, A0W, 1.0f, r19.A01.A0N(6249));
                if (!r11.A0e(file2)) {
                    file = C64393Dh.A00(r11, C18280x3.A0Y());
                    r11.A0a(file2, file);
                } else {
                    file = file2;
                }
                AnonymousClass33C r32 = new AnonymousClass33C();
                r32.A0F = file;
                if (str2 != null) {
                    int length2 = str2.length() - (A1U ? 1 : 0);
                    boolean z2 = false;
                    int i3 = 0;
                    while (i3 <= length2) {
                        int i4 = length2;
                        if (!z2) {
                            i4 = i3;
                        }
                        boolean A1P = AnonymousClass0x7.A1P(C162457s7.A00(str2.charAt(i4), 32));
                        if (!z2) {
                            if (!A1P) {
                                z2 = true;
                            } else {
                                i3++;
                            }
                        } else if (A1P) {
                            length2--;
                        }
                    }
                    str = str2.subSequence(i3, length2 + 1).toString();
                } else {
                    str = null;
                }
                AnonymousClass30M A002 = r20.A00((Uri) null, r32, (C108845de) null, r22, str, list, (List) null, (List) null, (byte) 9, 0, 0, z);
                int A082 = r17.A08(file2, A0W);
                Iterator A0x = AnonymousClass0x7.A0x(A002.A02);
                while (A0x.hasNext()) {
                    C30471mV A0S = C18320x8.A0S(A0x);
                    if (A0S instanceof AnonymousClass1nF) {
                        AnonymousClass1nF r1 = (AnonymousClass1nF) A0S;
                        r1.A00 = A082;
                        r1.A05 = A0W;
                        r1.A06 = A022;
                        r1.A1g(list2);
                    }
                }
                A002.A00 = i2;
                return AnonymousClass0x9.A0C(A002, A042);
            }
            r14.BhC(r9, C107105ah.A03);
            throw new C143386yn();
        } catch (Exception e) {
            return e;
        }
    }

    public void A0C(Object obj) {
        C69263Wi r1;
        int i;
        AnonymousClass4FU r4 = (AnonymousClass4FU) this.A0G.get();
        if (r4 != null) {
            r4.BjL();
        }
        Context context = this.A06.A00;
        if (obj instanceof C143376ym) {
            r1 = this.A03;
            i = R.string.f11nameremoved;
        } else if (obj instanceof C143386yn) {
            int A0N = this.A08.A0N(542);
            C69263Wi r10 = this.A03;
            Locale locale = AnonymousClass001.A0M(context).locale;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, A0N, 0);
            r10.A0O(r4, AnonymousClass002.A0F(context, this.A07.A0K(new Object[]{String.format(locale, "%d", objArr)}, 283, (long) A0N), new Object[1], 0, R.string.f11nameremoved));
            return;
        } else if (obj instanceof IOException) {
            Throwable th = (Throwable) obj;
            C18260x0.A1Q(AnonymousClass001.A0o(), "sendmedia/senddocumentasync/ioerror ", th);
            if (th.getMessage() == null || !C86624Kv.A1Z(th)) {
                this.A03.A0H(R.string.f11nameremoved, 0);
                return;
            } else {
                r1 = this.A03;
                i = R.string.f11nameremoved;
            }
        } else if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            this.A04.A08((AnonymousClass30M) pair.first, (byte[]) pair.second, false, false);
            return;
        } else {
            return;
        }
        r1.A0O(r4, context.getString(i));
    }

    public C992855d(Uri uri, AnonymousClass4FU r3, C64393Dh r4, C69263Wi r5, C621033m r6, C620633i r7, C54292oU r8, C620733j r9, AnonymousClass1VX r10, AnonymousClass4FV r11, C55972rD r12, C624134x r13, C107105ah r14, C989053r r15, File file, String str, List list, List list2, int i, boolean z) {
        this.A08 = r10;
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r4;
        this.A09 = r11;
        this.A04 = r6;
        this.A0A = r12;
        this.A0C = r14;
        this.A0D = r15;
        this.A05 = r7;
        this.A07 = r9;
        this.A0H = list;
        this.A01 = uri;
        this.A0E = file;
        this.A0B = r13;
        this.A0G = AnonymousClass0x9.A14(r3);
        this.A0J = z;
        this.A0F = str;
        this.A0I = list2;
        this.A00 = i;
    }
}
