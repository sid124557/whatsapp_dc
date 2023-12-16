package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5qB  reason: invalid class name and case insensitive filesystem */
public class C116375qB implements C185528tp {
    public boolean A00 = false;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ AnonymousClass5T7 A04;
    public final /* synthetic */ C105405Uu A05;
    public final /* synthetic */ AnonymousClass5X1 A06;
    public final /* synthetic */ C30771mz A07;
    public final /* synthetic */ C33141sV A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C116375qB(Context context, View view, AnonymousClass5T7 r4, C105405Uu r5, AnonymousClass5X1 r6, C30771mz r7, C33141sV r8, int i, boolean z, boolean z2) {
        this.A07 = r7;
        this.A02 = context;
        this.A05 = r5;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = i;
        this.A04 = r4;
        this.A06 = r6;
        this.A08 = r8;
        this.A03 = view;
    }

    public int BD5() {
        return this.A08.A05(this.A03.getContext());
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r31) {
        C152967aS r5;
        C160617ny r14;
        ByteArrayInputStream byteArrayInputStream;
        Bitmap bitmap2 = bitmap;
        if (!this.A00) {
            this.A00 = true;
            if (bitmap == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) {
                bitmap2 = null;
            }
            C30771mz r2 = this.A07;
            Context context = this.A02;
            String str = r2.A06;
            Activity A002 = C621633u.A00(context);
            if (A002 instanceof AnonymousClass67A) {
                r5 = ((AnonymousClass67A) A002).getCatalogLoadSession();
                if (bitmap2 != null) {
                    StringBuilder A0l = AnonymousClass000.A0l(str);
                    A0l.append('_');
                    String A0h = AnonymousClass000.A0h(A0l, 3);
                    C151257Ua r1 = r5.A01;
                    if (r1.A02 != null) {
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(C18320x8.A1Y(bitmap2, new ByteArrayOutputStream()));
                            AnonymousClass1LX r0 = r1.A02;
                            String A042 = C627236i.A04(A0h);
                            C626936e.A06(A042);
                            r0.A03.A04(byteArrayInputStream, A042);
                            byteArrayInputStream.close();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                }
            } else {
                r5 = null;
            }
            ArrayList A0s = AnonymousClass001.A0s();
            for (int i = 0; i < r2.A00; i++) {
                if (i != 0 || r5 == null || bitmap2 == null) {
                    A0s.add((Object) null);
                } else {
                    A0s.add(new C108815db(str, "", "", bitmap2.getWidth(), bitmap2.getHeight()));
                }
            }
            String str2 = r2.A09;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = r2.A04;
            if (str3 == null) {
                str3 = "";
            }
            BigDecimal bigDecimal = r2.A0A;
            if (TextUtils.isEmpty(r2.A03)) {
                r14 = null;
            } else {
                r14 = new C160617ny(r2.A03);
            }
            C109015dw r9 = new C109015dw((C166017y0) null, new C633238u((String) null, (String) null, (List) null, 0, false), (C108745dU) null, (C108755dV) null, r14, str, str2, str3, r2.A07, r2.A08, (String) null, bigDecimal, A0s, 0, 99, false, false);
            this.A05.A0E(r9, (UserJid) null);
            UserJid userJid = r2.A01;
            C626936e.A06(userJid);
            String str4 = r9.A0F;
            boolean z = this.A09;
            boolean z2 = this.A0A;
            AnonymousClass5ZY.A03(context, this.A04, this.A06, userJid, (Integer) null, (Integer) null, str4, this.A01, z, z2, false);
            return;
        }
        return;
        throw th;
    }

    public /* synthetic */ void Bp1(View view) {
    }
}
