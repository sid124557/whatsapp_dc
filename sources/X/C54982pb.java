package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.textstatus.UpdateTextStatusResponseImpl;
import com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusEmojiInput;
import com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusInput;
import com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusMutationInput;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2pb  reason: invalid class name and case insensitive filesystem */
public final class C54982pb {
    public C56972sr A00;
    public AnonymousClass33p A01;
    public C49552gi A02;
    public C46112b6 A03;
    public Boolean A04;
    public final C69263Wi A05;
    public final C29421in A06;
    public final C56612sH A07;

    public final void A01(long j, String str, long j2, String str2) {
        SharedPreferences.Editor A032 = C18270x1.A03(this.A01);
        A032.putString("my_current_evolved_about_text", str);
        A032.putString("my_current_evolved_about_emoji", str2);
        A032.putLong("my_current_evolved_about_duration", j);
        A032.putLong("my_current_evolved_about_set_timestamp", j2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            A032.remove("my_current_evolved_about_hash");
        } else {
            A032.putString("my_current_evolved_about_hash", (String) null);
        }
        A032.apply();
        this.A05.A0S(new C69993Zl(this, 5));
    }

    public final void A02(long j, String str, boolean z, String str2) {
        long j2 = j;
        this.A04 = Boolean.valueOf(z);
        String str3 = str2;
        A01(j2, str, this.A07.A0H(), str3);
        if (z) {
            j2 = -2;
        }
        XWA2TextStatusMutationInput xWA2TextStatusMutationInput = new XWA2TextStatusMutationInput();
        if (!(str == null || str.length() == 0)) {
            xWA2TextStatusMutationInput.A06("text", str);
        }
        if (str2 != null) {
            XWA2TextStatusEmojiInput xWA2TextStatusEmojiInput = new XWA2TextStatusEmojiInput();
            xWA2TextStatusEmojiInput.A06("content", str3);
            xWA2TextStatusMutationInput.A05(xWA2TextStatusEmojiInput, "emoji");
        }
        xWA2TextStatusMutationInput.A00().A05("ephemeral_duration_sec", Integer.valueOf((int) j2));
        C50712ie r3 = new UpdateTextStatusMutationImpl$Builder().A00;
        r3.A00(xWA2TextStatusMutationInput, "text_status_input");
        new C27861en(new C820642d(this.A02.A01(new AnonymousClass7J9(r3, UpdateTextStatusResponseImpl.class, "UpdateTextStatus")))).A07(TimeUnit.MILLISECONDS, new C818741k(this), 32000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (X.C175738Zn.A0V(r12) == false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52892mD A00() {
        /*
            r16 = this;
            r7 = r16
            X.33p r0 = r7.A01
            X.8qC r3 = r0.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r3)
            java.lang.String r4 = "my_current_evolved_about_duration"
            long r1 = X.AnonymousClass0x2.A0B(r0, r4)
            android.content.SharedPreferences r5 = X.C18300x5.A0B(r3)
            java.lang.String r0 = "my_current_evolved_about_text"
            java.lang.String r12 = X.C18280x3.A0Z(r5, r0)
            r5 = 0
            r9 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            r5 = -1
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            if (r12 == 0) goto L_0x0031
            boolean r0 = X.C175738Zn.A0V(r12)
            if (r0 == 0) goto L_0x004f
        L_0x0031:
            return r9
        L_0x0032:
            X.2sH r0 = r7.A07
            long r7 = r0.A0H()
            android.content.SharedPreferences r5 = X.C18300x5.A0B(r3)
            java.lang.String r0 = "my_current_evolved_about_set_timestamp"
            long r5 = X.AnonymousClass0x2.A0B(r5, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r0.toMillis(r1)
            long r5 = r5 + r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x004f
            return r9
        L_0x004f:
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r3)
            java.lang.String r0 = "my_current_evolved_about_emoji"
            java.lang.String r15 = r1.getString(r0, r9)
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r3)
            r1 = 0
            long r10 = r0.getLong(r4, r1)
            android.content.SharedPreferences r3 = X.C18300x5.A0B(r3)
            java.lang.String r0 = "my_current_evolved_about_set_timestamp"
            long r13 = r3.getLong(r0, r1)
            X.2mD r9 = new X.2mD
            r9.<init>(r10, r12, r13, r15)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54982pb.A00():X.2mD");
    }

    public final void A03(C46112b6 r6) {
        C95814uZ r0;
        String rawString;
        boolean z;
        this.A03 = r6;
        AnonymousClass1RR A012 = C56972sr.A01(this.A00);
        if (A012 == null || (r0 = A012.A0H) == null || (rawString = r0.getRawString()) == null) {
            Log.e("Unable to fetch my jid");
            return;
        }
        XWA2TextStatusInput xWA2TextStatusInput = new XWA2TextStatusInput();
        xWA2TextStatusInput.A06("jid", rawString);
        xWA2TextStatusInput.A06("last_update_time", (String) null);
        C129586aY of = C129586aY.of(xWA2TextStatusInput);
        C50712ie r3 = new GetTextStatusListQueryImpl$Builder().A00;
        if (of != null) {
            r3.A00.A07("input", of);
            z = true;
        } else {
            z = false;
        }
        C162187rP.A06(z);
        new C27861en(new C820642d(this.A02.A01(new AnonymousClass7J9(r3, GetTextStatusListResponseImpl.class, "GetTextStatusList")))).A07(TimeUnit.MILLISECONDS, new C818641j(this), 32000);
    }

    public C54982pb(C69263Wi r1, C56972sr r2, C29421in r3, C56612sH r4, AnonymousClass33p r5, C49552gi r6) {
        C18260x0.A0V(r4, r1, r2);
        C18260x0.A0T(r3, r5);
        this.A07 = r4;
        this.A05 = r1;
        this.A00 = r2;
        this.A02 = r6;
        this.A06 = r3;
        this.A01 = r5;
    }
}
