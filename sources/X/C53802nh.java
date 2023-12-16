package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.Telephony;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.invite.CreateAndGet1on1InviteCodeMutationImpl$Builder;
import com.whatsapp.infra.graphql.generated.invite.CreateAndGet1on1InviteCodeResponseImpl;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2nh  reason: invalid class name and case insensitive filesystem */
public final class C53802nh {
    public final C106175Xx A00;
    public final C69263Wi A01;
    public final C49762h3 A02;
    public final AnonymousClass1VX A03;
    public final C49552gi A04;
    public final AnonymousClass31C A05;
    public final C106675Zy A06;
    public final C183538qC A07;

    public final void A00(Context context, Uri uri, Integer num, String str) {
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.SENDTO");
        A09.setData(uri);
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(A09, 0);
        C162457s7.A0D(queryIntentActivities);
        if (C18310x6.A1X(queryIntentActivities)) {
            C18260x0.A1C("app/sms ", AnonymousClass001.A0o(), queryIntentActivities);
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
            if (defaultSmsPackage == null || defaultSmsPackage.length() == 0) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A09.setClassName(activityInfo.packageName, activityInfo.name);
                defaultSmsPackage = activityInfo.packageName;
            } else {
                A09.setPackage(defaultSmsPackage);
            }
            if (!(str == null || str.length() == 0)) {
                A09.putExtra("sms_body", str);
            }
            context.startActivity(A09);
            if (num != null) {
                this.A02.A01(num, defaultSmsPackage, 3);
                return;
            }
            return;
        }
        Log.e("app/sms/no activities");
    }

    public final void A01(Context context, Integer num, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        C18260x0.A0O(context2, str3);
        String replaceAll = str3.replaceAll("\\D", "");
        C162457s7.A0D(replaceAll);
        C106675Zy r1 = this.A06;
        Integer num2 = num;
        String str4 = str2;
        if (!r1.A04() && !r1.A05("BR")) {
            try {
                C183538qC r2 = this.A07;
                AnonymousClass8LC A0F = ((C162167rN) r2.get()).A0F(str3, (String) null);
                String valueOf = String.valueOf(A0F.countryCode_);
                r2.get();
                String A012 = C106675Zy.A01(valueOf, C162167rN.A01(A0F));
                C162457s7.A0D(A012);
                if (!"BR".equals(A012) && !"eu".equals(this.A00.A03(String.valueOf(A0F.countryCode_)))) {
                    AnonymousClass1VX r4 = this.A03;
                    C58422vE r3 = C58422vE.A02;
                    if (r4.A0Y(r3, 3379)) {
                        ProgressDialog progressDialog = new ProgressDialog(context2);
                        this.A01.A0S(new C70203a7(progressDialog, 34, context2));
                        C49982hR r5 = new C49982hR(progressDialog, context2, this, num2, str3, str4);
                        if (r4.A0Y(r3, 3941)) {
                            C67583Pw r42 = new C67583Pw(this.A04);
                            r42.A00 = r5;
                            C50712ie r32 = new CreateAndGet1on1InviteCodeMutationImpl$Builder().A00;
                            r32.A02("phoneNumber", replaceAll);
                            r42.A01.A00(new AnonymousClass7J9(r32, CreateAndGet1on1InviteCodeResponseImpl.class, "CreateAndGet1on1InviteCode"), r42).A00();
                            return;
                        }
                        C68163Sc r6 = new C68163Sc(this.A05);
                        r6.A00 = r5;
                        AnonymousClass31C r52 = r6.A01;
                        String A032 = r52.A03();
                        C35381wm r33 = new C35381wm(A032, 17);
                        C56052rL A002 = C56052rL.A00();
                        C56052rL.A0D(A002, "xmlns", "w:growth");
                        C56052rL A042 = C56052rL.A04("invite");
                        if (C626836d.A0M(replaceAll, 0, 1024, false)) {
                            C56052rL.A0D(A042, PublicKeyCredentialControllerUtility.JSON_KEY_USER, replaceAll);
                        }
                        r52.A0D(r6, C41032Ir.A03(A042, A002, r33), A032, 374, 0);
                        return;
                    }
                }
            } catch (C143616zC unused) {
            }
        }
        A02(context2, num2, str3, "https://whatsapp.com/dl/", str4);
    }

    public C53802nh(C106175Xx r1, C69263Wi r2, C49762h3 r3, AnonymousClass1VX r4, C49552gi r5, AnonymousClass31C r6, C106675Zy r7, C183538qC r8) {
        C18260x0.A0c(r4, r2, r7, r6);
        C18260x0.A0W(r8, r1, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0 != 2) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r7 = this;
            java.lang.String r0 = X.AnonymousClass000.A0T(r12, r10)
            android.net.Uri r5 = android.net.Uri.parse(r0)
            X.C162457s7.A0D(r5)
            X.1VX r6 = r7.A03
            r0 = 5787(0x169b, float:8.11E-42)
            X.2vE r4 = X.C58422vE.A02
            int r3 = r6.A0O(r4, r0)
            if (r3 == 0) goto L_0x002f
            r2 = 1
            if (r3 == r2) goto L_0x004a
            r1 = 2
            if (r3 == r1) goto L_0x0046
            r0 = 3
            if (r3 == r0) goto L_0x0042
            r0 = 4
            if (r3 == r0) goto L_0x003e
            r0 = 5786(0x169a, float:8.108E-42)
            int r0 = r6.A0O(r4, r0)
            if (r0 == 0) goto L_0x002f
            if (r0 == r2) goto L_0x004a
            if (r0 == r1) goto L_0x0046
        L_0x002f:
            r1 = 2131894325(0x7f122035, float:1.9423452E38)
        L_0x0032:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r11)
            java.lang.String r0 = r8.getString(r1, r0)
            r7.A00(r8, r5, r9, r0)
            return
        L_0x003e:
            r1 = 2131890303(0x7f12107f, float:1.9415294E38)
            goto L_0x0032
        L_0x0042:
            r1 = 2131890302(0x7f12107e, float:1.9415292E38)
            goto L_0x0032
        L_0x0046:
            r1 = 2131890301(0x7f12107d, float:1.941529E38)
            goto L_0x0032
        L_0x004a:
            r1 = 2131890300(0x7f12107c, float:1.9415288E38)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53802nh.A02(android.content.Context, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
