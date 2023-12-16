package X;

/* renamed from: X.2di  reason: invalid class name and case insensitive filesystem */
public abstract class C47722di {
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030d, code lost:
        if (r2.A0Y(r1, 2189) == false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r3.A02.A0Y(X.C58422vE.A02, 3989) == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass1VG
            if (r0 == 0) goto L_0x0049
            r3 = r12
            X.1VG r3 = (X.AnonymousClass1VG) r3
            X.33p r2 = r3.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "tos_2016_opt_out_state"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0020
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            boolean r0 = X.C18280x3.A1W(r0, r1)
            if (r0 != 0) goto L_0x002d
        L_0x0020:
            X.1VX r2 = r3.A02
            r1 = 3989(0xf95, float:5.59E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r4 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            X.2oU r0 = r3.A00
            android.content.Context r1 = r0.A00
            android.content.pm.PackageManager r3 = r1.getPackageManager()
            X.C162457s7.A0D(r3)
            java.lang.String r0 = "com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity"
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r1, r0)
            r1 = 1
            r0 = 2
            if (r4 == 0) goto L_0x0045
            r0 = 1
        L_0x0045:
            r3.setComponentEnabledSetting(r2, r0, r1)
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r12 instanceof X.AnonymousClass1VQ
            if (r0 == 0) goto L_0x0084
            r4 = r12
            X.1VQ r4 = (X.AnonymousClass1VQ) r4
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0048
            X.1VX r0 = r4.A05
            boolean r0 = X.C56952sp.A0F(r0)
            if (r0 == 0) goto L_0x0048
            X.33p r0 = r4.A03
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "my_current_status"
            java.lang.String r3 = X.C18280x3.A0Z(r1, r0)
            X.2oU r0 = r4.A02
            android.content.Context r0 = r0.A00
            X.C162457s7.A0D(r0)
            boolean r0 = X.AnonymousClass31U.A02(r0, r3)
            if (r0 != 0) goto L_0x0077
            r3 = 0
        L_0x0077:
            X.4FS r2 = r4.A06
            r0 = 16
            X.3c0 r1 = new X.3c0
            r1.<init>(r0, r3, r4)
        L_0x0080:
            r2.BkM(r1)
            return
        L_0x0084:
            boolean r0 = r12 instanceof X.AnonymousClass1VO
            if (r0 == 0) goto L_0x00ae
            r4 = r12
            X.1VO r4 = (X.AnonymousClass1VO) r4
            X.1VX r2 = r4.A02
            r1 = 5718(0x1656, float:8.013E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0048
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.A00
            r1 = 1
            r0 = 0
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0048
            X.4C6 r3 = r4.A04
            r2 = 0
            com.whatsapp.productinfra.reportingtoken.ReportingTokenABPropObserver$onAfterABPropsChanged$1 r1 = new com.whatsapp.productinfra.reportingtoken.ReportingTokenABPropObserver$onAfterABPropsChanged$1
            r1.<init>(r4, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x00ae:
            boolean r0 = r12 instanceof X.AnonymousClass1VP
            if (r0 == 0) goto L_0x010c
            r2 = r12
            X.1VP r2 = (X.AnonymousClass1VP) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PollReceivingObservers/onAfterABPropsChanged wasPollsReceivingEnabled"
            r1.append(r0)
            boolean r0 = r2.A01
            X.C18260x0.A1U(r1, r0)
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x00e0
            X.1VX r0 = r2.A04
            boolean r0 = X.AnonymousClass31e.A01(r0)
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "PollReceivingObservers/onAfterABPropsChanged setFutureProofProcessingNeeded due to poll receiving ab prop"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r1 = r2.A05
            r0 = 24
        L_0x00d8:
            X.3bp r0 = X.C71263bp.A00(r2, r0)
        L_0x00dc:
            r1.BkM(r0)
            return
        L_0x00e0:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x00f6
            X.1VX r0 = r2.A04
            boolean r0 = X.AnonymousClass31e.A00(r0)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "PollReceivingObservers/onAfterABPropsChanged setFutureProofProcessingNeeded due to poll receiving in cag ab prop"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r1 = r2.A05
            r0 = 25
            goto L_0x00d8
        L_0x00f6:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0048
            X.1VX r0 = r2.A04
            boolean r0 = X.AnonymousClass31e.A02(r0)
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "PollReceivingObservers/onAfterABPropsChanged setFutureProofProcessingNeeded due to single option poll received ab prop"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r1 = r2.A05
            r0 = 26
            goto L_0x00d8
        L_0x010c:
            boolean r0 = r12 instanceof X.AnonymousClass1VI
            if (r0 == 0) goto L_0x01c1
            r7 = r12
            X.1VI r7 = (X.AnonymousClass1VI) r7
            X.33p r2 = r7.A02
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "newsletter_wait_list_subscription"
            boolean r0 = X.C18280x3.A1W(r0, r1)
            if (r0 == 0) goto L_0x0048
            X.5UP r0 = r7.A03
            boolean r0 = X.C18300x5.A1S(r0)
            if (r0 == 0) goto L_0x0048
            r3 = 0
            X.C18270x1.A0v(r2, r1, r3)
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "whatsapp"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "channel"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "directory"
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri r2 = r0.build()
            X.2oU r0 = r7.A00
            android.content.Context r8 = r0.A00
            X.C162457s7.A0D(r8)
            android.content.Intent r1 = X.C18300x5.A07(r8)
            java.lang.String r0 = "com.whatsapp.intent.action.NEWSLETTER"
            android.content.Intent r1 = r1.setAction(r0)
            X.C162457s7.A0D(r1)
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.setAction(r0)
            r1.setData(r2)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)
            java.lang.String r0 = "extra_from_notification"
            r6 = 1
            r1.putExtra(r0, r6)
            android.app.PendingIntent r5 = X.C624735e.A04(r8, r1, r3)
            r0 = 2131895474(0x7f1224b2, float:1.9425782E38)
            java.lang.String r4 = X.C18290x4.A0l(r8, r0)
            X.0Ue r3 = X.C66553Lw.A01(r8)
            java.lang.String r0 = "newsletter_key_messages"
            r3.A0L = r0
            r2 = 8
            android.app.Notification r1 = r3.A07
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            java.lang.String r0 = "critical_app_alerts@1"
            r3.A0K = r0
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            X.C18300x5.A14(r8, r3, r0)
            r3.A0A(r4)
            r3.A0C(r4)
            r3.A03 = r6
            r3.A0E(r6)
            X.AnonymousClass33T.A01(r5, r3)
            X.33T r1 = r7.A01
            r0 = 70
            X.AnonymousClass33T.A03(r3, r1, r0)
            X.5YD r2 = r7.A04
            r0 = 4
            X.1Y9 r1 = new X.1Y9
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.4FV r0 = r2.A03
            r0.BhD(r1)
            return
        L_0x01c1:
            boolean r0 = r12 instanceof X.AnonymousClass1VF
            if (r0 == 0) goto L_0x01d4
            r0 = r12
            X.1VF r0 = (X.AnonymousClass1VF) r0
            X.4FS r2 = r0.A01
            X.2sE r1 = r0.A00
            java.util.Objects.requireNonNull(r1)
            r0 = 4
            X.C70023Zo.A00(r2, r1, r0)
            return
        L_0x01d4:
            boolean r0 = r12 instanceof X.AnonymousClass1VR
            if (r0 == 0) goto L_0x021c
            r3 = r12
            X.1VR r3 = (X.AnonymousClass1VR) r3
            X.33p r0 = r3.A02
            X.8qC r2 = r0.A01
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r2)
            java.lang.String r1 = "ug_sync_state"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x021a
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r2)
            boolean r0 = X.C18280x3.A1W(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x01f8:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 != 0) goto L_0x0210
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0048
            X.1VX r2 = r3.A05
            r1 = 3010(0xbc2, float:4.218E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0048
        L_0x0210:
            X.4FS r1 = r3.A07
            r0 = 16
            X.3Zm r0 = X.C70003Zm.A00(r3, r0)
            goto L_0x00dc
        L_0x021a:
            r1 = 0
            goto L_0x01f8
        L_0x021c:
            boolean r0 = r12 instanceof X.AnonymousClass1VE
            if (r0 == 0) goto L_0x023b
            r0 = r12
            X.1VE r0 = (X.AnonymousClass1VE) r0
            X.4AF r3 = r0.A01
            X.1VX r1 = r0.A00
            r0 = 3664(0xe50, float:5.134E-42)
            java.lang.Boolean r2 = X.C56952sp.A07(r1, r0)
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            r1 = 13293(0x33ed, float:1.8627E-41)
            X.C18300x5.A1G(r3, r2, r1)
            r0 = 2
            r3.Blk(r2, r1, r0)
            return
        L_0x023b:
            boolean r0 = r12 instanceof X.AnonymousClass1VU
            if (r0 == 0) goto L_0x0291
            r3 = r12
            X.1VU r3 = (X.AnonymousClass1VU) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FutureProofReprocessorAbPropsObserver/onAfterABPropsChanged "
            r1.append(r0)
            boolean r0 = r3 instanceof X.C26111bb
            if (r0 == 0) goto L_0x0280
            java.lang.String r2 = "lottie"
        L_0x0251:
            r1.append(r2)
            java.lang.String r0 = " wasEnabled:"
            r1.append(r0)
            boolean r0 = r3.A00
            X.C18260x0.A1U(r1, r0)
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0048
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "FutureProofReprocessorAbPropsObserver/onAfterABPropsChanged setFutureProofProcessingNeeded due to ab prop "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " enabled"
            X.C18260x0.A1J(r1, r0)
            X.33p r1 = r3.A01
        L_0x027b:
            r0 = 1
            r1.A1o(r0)
            return
        L_0x0280:
            boolean r0 = r3 instanceof X.C26101ba
            if (r0 == 0) goto L_0x0287
            java.lang.String r2 = "PTV"
            goto L_0x0251
        L_0x0287:
            boolean r0 = r3 instanceof X.C26091bZ
            if (r0 == 0) goto L_0x028e
            java.lang.String r2 = "group mention"
            goto L_0x0251
        L_0x028e:
            java.lang.String r2 = "comments"
            goto L_0x0251
        L_0x0291:
            boolean r0 = r12 instanceof X.AnonymousClass1VV
            if (r0 == 0) goto L_0x02b0
            r5 = r12
            X.1VV r5 = (X.AnonymousClass1VV) r5
            java.lang.Runnable r1 = r5.A00
            if (r1 == 0) goto L_0x02a1
            X.4FS r0 = r5.A04
            r0.BjN(r1)
        L_0x02a1:
            X.4FS r4 = r5.A04
            java.lang.String r3 = "AbPropsTamperManager/ap-props-hash-update"
            java.lang.Runnable r2 = r5.A07
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Runnable r0 = r4.Bkn(r2, r3, r0)
            r5.A00 = r0
            return
        L_0x02b0:
            boolean r0 = r12 instanceof X.AnonymousClass1VK
            if (r0 == 0) goto L_0x02d4
            r4 = r12
            X.1VK r4 = (X.AnonymousClass1VK) r4
            X.1he r3 = r4.A01
            X.1VX r2 = r3.A02
            r1 = 736(0x2e0, float:1.031E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 != 0) goto L_0x0048
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0048
            X.30l r3 = r3.A01
            java.lang.String r0 = "setting_unarchiveChats"
            java.lang.String r2 = "syncd_bootstrapped_mutations"
            monitor-enter(r2)
            goto L_0x0559
        L_0x02d4:
            boolean r0 = r12 instanceof X.AnonymousClass1VN
            if (r0 == 0) goto L_0x0338
            r3 = r12
            X.1VN r3 = (X.AnonymousClass1VN) r3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageEditPropObserver/onAfterABPropsChanged wasEditReceiveEnabled:"
            r1.append(r0)
            boolean r0 = r3.A01
            X.C18260x0.A1U(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageEditPropObserver/onAfterABPropsChanged wasCaptionEditReceiveEnabled:"
            r1.append(r0)
            boolean r0 = r3.A00
            X.C18260x0.A1U(r1, r0)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x031f
            X.1VX r2 = r3.A03
            r0 = 2190(0x88e, float:3.069E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 != 0) goto L_0x030f
            r0 = 2189(0x88d, float:3.067E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x031f
        L_0x030f:
            java.lang.String r0 = "MessageEditPropObserver/onAfterABPropsChanged setFutureProofProcessingNeeded due to edit receive ab prop enabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4FS r2 = r3.A04
            r0 = 18
            X.5rM r1 = new X.5rM
            r1.<init>(r3, r0)
            goto L_0x0080
        L_0x031f:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0048
            X.1VX r2 = r3.A03
            r0 = 3687(0xe67, float:5.167E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 != 0) goto L_0x030f
            r0 = 3686(0xe66, float:5.165E-42)
            boolean r0 = r2.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x030f
        L_0x0338:
            boolean r0 = r12 instanceof X.AnonymousClass1VT
            if (r0 == 0) goto L_0x03de
            r3 = r12
            X.1VT r3 = (X.AnonymousClass1VT) r3
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x035e
            X.1VX r2 = r3.A08
            r1 = 1829(0x725, float:2.563E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            r0 = 3
            if (r1 < r0) goto L_0x035e
            X.4FS r2 = r3.A0A
            r0 = 10
            X.3Zi r1 = X.C69963Zi.A00(r3, r0)
            java.lang.String r0 = "recent_sticker_abprop_enabled"
            r2.BkN(r1, r0)
        L_0x035e:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x037c
            X.1VX r2 = r3.A08
            r1 = 1967(0x7af, float:2.756E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x037c
            X.4FS r2 = r3.A0A
            r0 = 11
            X.3Zi r1 = X.C69963Zi.A00(r3, r0)
            java.lang.String r0 = "note_to_self_enabled"
            r2.BkN(r1, r0)
        L_0x037c:
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x0399
            X.1VX r2 = r3.A08
            r1 = 3530(0xdca, float:4.947E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0399
            X.4FS r2 = r3.A0A
            r0 = 12
            X.3Zi r1 = X.C69963Zi.A00(r3, r0)
            java.lang.String r0 = "external_web_beta_sync_enabled"
            r2.BkN(r1, r0)
        L_0x0399:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x03b6
            X.1VX r2 = r3.A08
            r1 = 2775(0xad7, float:3.889E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x03b6
            X.4FS r2 = r3.A0A
            r0 = 13
            X.3Zi r1 = X.C69963Zi.A00(r3, r0)
            java.lang.String r0 = "favorite_sticker_sync_enabled"
            r2.BkN(r1, r0)
        L_0x03b6:
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x03d4
            X.1VX r2 = r3.A08
            r1 = 3436(0xd6c, float:4.815E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x03d4
            X.4FS r2 = r3.A0A
            r0 = 14
            X.3Zi r1 = X.C69963Zi.A00(r3, r0)
            java.lang.String r0 = "privacy_setting_relay_all_calls_sync_enabled"
            r2.BkN(r1, r0)
        L_0x03d4:
            X.3Gp r2 = r3.A05
            X.4FS r1 = r2.A0h
            r0 = 21
            X.C69963Zi.A01(r1, r2, r0)
            return
        L_0x03de:
            boolean r0 = r12 instanceof X.AnonymousClass1VL
            if (r0 == 0) goto L_0x0402
            r4 = r12
            X.1VL r4 = (X.AnonymousClass1VL) r4
            X.1VX r2 = r4.A01
            r1 = 2304(0x900, float:3.229E-42)
            X.2vE r0 = X.C58422vE.A02
            int r3 = r2.A0O(r0, r1)
            int r0 = r4.A00
            if (r3 <= r0) goto L_0x0048
            X.3Lq r2 = r4.A02
            r0 = 7
            X.3Zm r1 = X.C70003Zm.A00(r2, r0)
            X.4FS r0 = r2.A1C
            r0.BkM(r1)
            r4.A00 = r3
            return
        L_0x0402:
            boolean r0 = r12 instanceof X.AnonymousClass1VM
            if (r0 == 0) goto L_0x042c
            r4 = r12
            X.1VM r4 = (X.AnonymousClass1VM) r4
            X.1VX r2 = r4.A02
            r1 = 2507(0x9cb, float:3.513E-42)
            X.2vE r0 = X.C58422vE.A02
            int r3 = r2.A0O(r0, r1)
            int r0 = r4.A00
            if (r3 <= r0) goto L_0x0048
            X.2jr r0 = r4.A01
            int r1 = r0.A00()
            r0 = 2
            if (r1 < r0) goto L_0x0570
            r0 = 6
            if (r1 <= r0) goto L_0x0048
            r0 = 10
            if (r1 < r0) goto L_0x056c
            r0 = 14
            if (r1 > r0) goto L_0x0570
            return
        L_0x042c:
            boolean r0 = r12 instanceof X.AnonymousClass1VJ
            if (r0 == 0) goto L_0x0484
            r3 = r12
            X.1VJ r3 = (X.AnonymousClass1VJ) r3
            X.8y5 r0 = r3.A04
            boolean r2 = r0.BIC()
            boolean r0 = r3.A00
            if (r0 == r2) goto L_0x045a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ScreenShareABPropObserver isScreenSharingEnabled changed to "
            X.C18260x0.A1E(r0, r1, r2)
            r3.A00 = r2
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r3.A05
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.hasBeenQueriedByDriver
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x045a
            java.lang.String r0 = "ScreenShareABPropObserver refresh capture devs"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.Voip.refreshCaptureDevice()
        L_0x045a:
            X.1VX r2 = r3.A03
            r1 = 4536(0x11b8, float:6.356E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            if (r0 != 0) goto L_0x0048
            X.5Xv r2 = r3.A02
            android.content.SharedPreferences r0 = r2.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "ss_permission_dialog_show_count"
            X.C18270x1.A0g(r1, r0)
            android.content.SharedPreferences r0 = r2.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "as_permission_dialog_show_count"
            X.C18270x1.A0g(r1, r0)
            return
        L_0x0484:
            boolean r0 = r12 instanceof X.AnonymousClass1VS
            if (r0 == 0) goto L_0x04c3
            r5 = r12
            X.1VS r5 = (X.AnonymousClass1VS) r5
            X.1VX r4 = r5.A07
            r0 = 4010(0xfaa, float:5.619E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r2 = r4.A0Y(r1, r0)
            r0 = 4165(0x1045, float:5.836E-42)
            boolean r3 = r4.A0Y(r1, r0)
            r0 = 5459(0x1553, float:7.65E-42)
            boolean r1 = r4.A0Y(r1, r0)
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x04a7
            if (r2 != 0) goto L_0x04ad
        L_0x04a7:
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x04b9
            if (r1 == 0) goto L_0x04b9
        L_0x04ad:
            X.4FS r2 = r5.A08
            r1 = 13
            X.5rQ r0 = new X.5rQ
            r0.<init>(r5, r1)
            r2.BkM(r0)
        L_0x04b9:
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x0048
            X.33p r1 = r5.A06
            goto L_0x027b
        L_0x04c3:
            r6 = r12
            X.1VH r6 = (X.AnonymousClass1VH) r6
            X.33p r2 = r6.A04
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "notify_account_switching_available"
            boolean r0 = X.C18280x3.A1W(r0, r1)
            if (r0 == 0) goto L_0x0048
            X.30z r0 = r6.A00
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0048
            r0 = 0
            X.C18270x1.A0v(r2, r1, r0)
            java.lang.String r0 = "AccountSwitchingAbPropObserver/showAccountSwitchingAvailableNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2JK r8 = r6.A02
            X.2oU r2 = r6.A03
            android.content.Context r1 = r2.A00
            r0 = 2131895665(0x7f122571, float:1.942617E38)
            java.lang.String r11 = X.C18290x4.A0l(r1, r0)
            r0 = 2131886272(0x7f1200c0, float:1.9407118E38)
            java.lang.String r7 = X.C54292oU.A04(r2, r0)
            r4 = 17
            android.content.Intent r9 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.Settings"
            r9.setClassName(r1, r0)
            java.lang.String r1 = "account_switcher"
            r0 = 1
            r9.putExtra(r1, r0)
            java.lang.String r0 = "source"
            r9.putExtra(r0, r4)
            java.lang.String r5 = "account_switching_available"
            r10 = 1
            r1 = 3
            X.2oU r0 = r8.A00
            android.content.Context r2 = r0.A00
            java.lang.String r0 = "other_notifications@1"
            X.0Ue r3 = new X.0Ue
            r3.<init>(r2, r0)
            X.C18320x8.A0y(r2, r3)
            r3.A02(r1)
            X.C18320x8.A17(r3, r11, r7, r10)
            r1 = 2131233341(0x7f080a3d, float:1.8082817E38)
            android.app.Notification r0 = r3.A07
            r0.icon = r1
            X.C18270x1.A0r(r3, r7)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = 0
            android.app.PendingIntent r0 = X.C624735e.A00(r2, r1, r9, r0)
            r3.A09 = r0
            r3.A0C(r7)
            r3.A03 = r1
            X.33T r2 = r8.A01
            r1 = 64
            android.app.Notification r0 = r3.A01()
            r2.A0A(r5, r1, r0)
            X.5XC r1 = r6.A01
            r0 = 15
            r1.A00(r4, r0)
            return
        L_0x0559:
            java.util.Set r1 = r3.A03()     // Catch:{ all -> 0x0569 }
            r1.remove(r0)     // Catch:{ all -> 0x0569 }
            android.content.SharedPreferences$Editor r0 = X.C613730l.A00(r3)     // Catch:{ all -> 0x0569 }
            X.C18300x5.A15(r0, r2, r1)     // Catch:{ all -> 0x0569 }
            monitor-exit(r2)     // Catch:{ all -> 0x0569 }
            return
        L_0x0569:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0569 }
            throw r0
        L_0x056c:
            r0 = 7
            if (r1 != r0) goto L_0x0570
            return
        L_0x0570:
            X.3Lq r2 = r4.A03
            r0 = 6
            X.3Zm r1 = X.C70003Zm.A00(r2, r0)
            X.4FS r0 = r2.A1C
            r0.BkM(r1)
            r4.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47722di.A03():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r3.A0Y(r2, 2189) != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (r3.A0Y(r2, 3686) != false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass1VQ
            if (r0 == 0) goto L_0x0010
            r1 = r5
            X.1VQ r1 = (X.AnonymousClass1VQ) r1
            X.1VX r0 = r1.A05
            boolean r0 = X.C56952sp.A0F(r0)
            r1.A00 = r0
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r5 instanceof X.AnonymousClass1VO
            if (r0 == 0) goto L_0x0027
            r0 = r5
            X.1VO r0 = (X.AnonymousClass1VO) r0
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.A00
            X.1VX r2 = r0.A02
            r1 = 5718(0x1656, float:8.013E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r3.set(r0)
            return
        L_0x0027:
            boolean r0 = r5 instanceof X.AnonymousClass1VP
            if (r0 == 0) goto L_0x0043
            r2 = r5
            X.1VP r2 = (X.AnonymousClass1VP) r2
            X.1VX r1 = r2.A04
            boolean r0 = X.AnonymousClass31e.A01(r1)
            r2.A01 = r0
            boolean r0 = X.AnonymousClass31e.A00(r1)
            r2.A00 = r0
            boolean r0 = X.AnonymousClass31e.A02(r1)
            r2.A02 = r0
            return
        L_0x0043:
            boolean r0 = r5 instanceof X.AnonymousClass1VR
            if (r0 == 0) goto L_0x0057
            r3 = r5
            X.1VR r3 = (X.AnonymousClass1VR) r3
            X.1VX r2 = r3.A05
            r1 = 3010(0xbc2, float:4.218E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r3.A00 = r0
            return
        L_0x0057:
            boolean r0 = r5 instanceof X.AnonymousClass1VU
            if (r0 == 0) goto L_0x0065
            r1 = r5
            X.1VU r1 = (X.AnonymousClass1VU) r1
            boolean r0 = r1.A05()
            r1.A00 = r0
            return
        L_0x0065:
            boolean r0 = r5 instanceof X.AnonymousClass1VK
            if (r0 == 0) goto L_0x007b
            r3 = r5
            X.1VK r3 = (X.AnonymousClass1VK) r3
            X.1he r0 = r3.A01
            X.1VX r2 = r0.A02
            r1 = 736(0x2e0, float:1.031E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r3.A00 = r0
            return
        L_0x007b:
            boolean r0 = r5 instanceof X.AnonymousClass1VN
            if (r0 == 0) goto L_0x00af
            r4 = r5
            X.1VN r4 = (X.AnonymousClass1VN) r4
            X.1VX r3 = r4.A03
            r0 = 2190(0x88e, float:3.069E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 != 0) goto L_0x0097
            r0 = 2189(0x88d, float:3.067E-42)
            boolean r1 = r3.A0Y(r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0098
        L_0x0097:
            r0 = 1
        L_0x0098:
            r4.A01 = r0
            r0 = 3687(0xe67, float:5.167E-42)
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 != 0) goto L_0x00ab
            r0 = 3686(0xe66, float:5.165E-42)
            boolean r1 = r3.A0Y(r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00ac
        L_0x00ab:
            r0 = 1
        L_0x00ac:
            r4.A00 = r0
            return
        L_0x00af:
            boolean r0 = r5 instanceof X.AnonymousClass1VT
            if (r0 == 0) goto L_0x00e8
            r4 = r5
            X.1VT r4 = (X.AnonymousClass1VT) r4
            X.1VX r3 = r4.A08
            r0 = 1829(0x725, float:2.563E-42)
            X.2vE r2 = X.C58422vE.A02
            int r1 = r3.A0O(r2, r0)
            r0 = 3
            boolean r0 = X.C18280x3.A1U(r1, r0)
            r4.A04 = r0
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = r3.A0Y(r2, r0)
            r4.A02 = r0
            r0 = 3530(0xdca, float:4.947E-42)
            boolean r0 = r3.A0Y(r2, r0)
            r4.A00 = r0
            r0 = 2775(0xad7, float:3.889E-42)
            boolean r0 = r3.A0Y(r2, r0)
            r4.A01 = r0
            r0 = 3436(0xd6c, float:4.815E-42)
            boolean r0 = r3.A0Y(r2, r0)
            r4.A03 = r0
            return
        L_0x00e8:
            boolean r0 = r5 instanceof X.AnonymousClass1VL
            if (r0 == 0) goto L_0x00fc
            r3 = r5
            X.1VL r3 = (X.AnonymousClass1VL) r3
            X.1VX r2 = r3.A01
            r1 = 2304(0x900, float:3.229E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            r3.A00 = r0
            return
        L_0x00fc:
            boolean r0 = r5 instanceof X.AnonymousClass1VM
            if (r0 == 0) goto L_0x0110
            r3 = r5
            X.1VM r3 = (X.AnonymousClass1VM) r3
            X.1VX r2 = r3.A02
            r1 = 2507(0x9cb, float:3.513E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            r3.A00 = r0
            return
        L_0x0110:
            boolean r0 = r5 instanceof X.AnonymousClass1VS
            if (r0 == 0) goto L_0x000f
            r3 = r5
            X.1VS r3 = (X.AnonymousClass1VS) r3
            X.1VX r2 = r3.A07
            r0 = 4010(0xfaa, float:5.619E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r1, r0)
            r3.A00 = r0
            r0 = 4165(0x1045, float:5.836E-42)
            boolean r0 = r2.A0Y(r1, r0)
            r3.A01 = r0
            r0 = 5459(0x1553, float:7.65E-42)
            boolean r0 = r2.A0Y(r1, r0)
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47722di.A04():void");
    }
}
