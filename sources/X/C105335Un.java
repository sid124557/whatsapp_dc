package X;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* renamed from: X.5Un  reason: invalid class name and case insensitive filesystem */
public abstract class C105335Un {
    public final C116985rC A00;
    public final C64393Dh A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C56332ro A04;
    public final C620633i A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final C49652gs A08;
    public final C187958y5 A09;
    public final AnonymousClass4FS A0A;

    public abstract int A01();

    public void A05(Intent intent, C89654ea r8, int i) {
        A06(intent, r8, r8, (AnonymousClass3ZH) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.content.Intent r13, X.C89654ea r14, X.AnonymousClass64N r15, X.AnonymousClass3ZH r16, int r17) {
        /*
            r12 = this;
            r3 = r14
            r8 = r16
            if (r13 == 0) goto L_0x0031
            android.net.Uri r2 = r13.getData()
            java.lang.String r0 = "webImageSource"
            java.lang.String r9 = r13.getStringExtra(r0)
            if (r2 != 0) goto L_0x0033
        L_0x0011:
            java.io.File r0 = r12.A03(r8)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0025
            java.io.File r0 = r12.A03(r8)
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            if (r2 != 0) goto L_0x0033
        L_0x0025:
            java.lang.String r0 = "profileinfo/cropphoto/no-data"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131889079(0x7f120bb7, float:1.9412811E38)
            r14.Bot(r0)
            return
        L_0x0031:
            r9 = 0
            goto L_0x0011
        L_0x0033:
            X.33i r6 = r12.A05
            X.33j r7 = r12.A06
            X.2ro r5 = r12.A04
            int r11 = r12.A01()
            X.55Z r1 = new X.55Z
            r4 = r15
            r10 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.4FS r0 = r12.A0A
            X.C86614Ku.A1R(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105335Un.A06(android.content.Intent, X.4ea, X.64N, X.3ZH, int):void");
    }

    public void A07(C009707r r10, AnonymousClass3ZH r11, int i) {
        A08(r10, r11, i, 1, -1, true, false, false);
    }

    public void A09(C009707r r10, AnonymousClass3ZH r11, int i, boolean z) {
        A08(r10, r11, 12, 1, i, true, z, false);
    }

    public abstract boolean A0B(AnonymousClass3ZH r1);

    public static Intent A00(Context context, boolean z) {
        Intent intent = new Intent();
        String packageName = context.getPackageName();
        if (z) {
            intent.setClassName(packageName, "com.whatsapp.profile.ResetGroupPhoto");
            intent.putExtra("IS_COMMUNITY_KEY", true);
            return intent;
        }
        intent.setClassName(packageName, "com.whatsapp.profile.ResetGroupPhoto");
        return intent;
    }

    public File A02() {
        return C64393Dh.A00(this.A01, "tmpi");
    }

    public File A03(AnonymousClass3ZH r5) {
        String A0i;
        C64393Dh r2;
        StringBuilder A0l;
        if (r5 instanceof AnonymousClass1RS) {
            r2 = this.A01;
            A0l = AnonymousClass000.A0l("tmpi");
            A0i = ((AnonymousClass1RS) r5).A00;
        } else {
            if (r5 != null) {
                C95814uZ r1 = r5.A0H;
                if (C95804uY.A00(r1)) {
                    A0i = C18300x5.A0i(r1);
                    r2 = this.A01;
                    A0l = AnonymousClass000.A0l("tmpi");
                }
            }
            return A02();
        }
        return C64393Dh.A00(r2, AnonymousClass000.A0X(A0i, A0l));
    }

    public void A04(Intent intent, C89654ea r4) {
        int A072 = C86664Kz.A07(intent, "error_message_id");
        if (A072 > 0) {
            this.A02.A0N(r4, A072);
        }
    }

    public boolean A0A(int i, boolean z) {
        if (z || this.A03.A0Y() || A01() == 1 || i == 2 || !this.A07.A0X(1396)) {
            return false;
        }
        return true;
    }

    public C105335Un(C116985rC r1, C64393Dh r2, C69263Wi r3, C56972sr r4, C56332ro r5, C620633i r6, C620733j r7, AnonymousClass1VX r8, C49652gs r9, C187958y5 r10, AnonymousClass4FS r11) {
        this.A07 = r8;
        this.A02 = r3;
        this.A03 = r4;
        this.A0A = r11;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A09 = r10;
        this.A05 = r6;
        this.A08 = r9;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c8, code lost:
        if (r4 != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x022a, code lost:
        if (A0B(r15) == false) goto L_0x022c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x023e, code lost:
        if (r15.A0J != null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0342, code lost:
        if (r7 != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0368, code lost:
        if (A0B(r15) == false) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0371, code lost:
        r1 = com.whatsapp.R.string.f11nameremoved;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C009707r r14, X.AnonymousClass3ZH r15, int r16, int r17, int r18, boolean r19, boolean r20, boolean r21) {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x0397
            X.4uZ r0 = r15.A0H
        L_0x0004:
            boolean r0 = X.C95804uY.A00(r0)
            if (r0 == 0) goto L_0x0391
            java.io.File r0 = r13.A03(r15)
        L_0x000e:
            r0.delete()
            X.1VX r1 = r13.A07
            r0 = 689(0x2b1, float:9.65E-43)
            boolean r1 = r1.A0X(r0)
            r0 = 4
            java.util.ArrayList r8 = X.AnonymousClass002.A0I(r0)
            r10 = r18
            r9 = r20
            if (r1 == 0) goto L_0x0232
            r4 = 0
            if (r15 == 0) goto L_0x022f
            boolean r0 = r15.A0U()
            if (r0 == 0) goto L_0x022f
            r3 = 1
            X.2Ls r0 = r15.A0J
            if (r0 == 0) goto L_0x0033
            r4 = 1
        L_0x0033:
            r0 = 2
            if (r10 != r0) goto L_0x0223
            X.2ro r0 = r13.A04
            X.3Dh r1 = r0.A00
            java.lang.String r0 = "tmpp"
            java.io.File r0 = r1.A0S(r0)
            boolean r1 = r0.exists()
        L_0x0044:
            if (r19 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            if (r3 == 0) goto L_0x020b
            android.content.Intent r5 = A00(r14, r4)
        L_0x004e:
            r1 = 2131893038(0x7f121b2e, float:1.9420841E38)
            r0 = 2131231730(0x7f0803f2, float:1.807955E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r5)
            r0 = 1
            r2.A04 = r0
            r0 = 2131431437(0x7f0b100d, float:1.8484603E38)
            r2.A00 = r0
            r0 = 2
            r2.A01 = r0
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131101268(0x7f060654, float:1.781494E38)
            r2.A01(r1, r0)
            X.5dk r0 = r2.A00()
            r8.add(r0)
        L_0x0075:
            X.8y5 r0 = r13.A09
            boolean r0 = r0.BFD()
            java.lang.String r5 = "should_return_photo_source"
            if (r0 == 0) goto L_0x00ba
            java.io.File r0 = r13.A03(r15)
            android.net.Uri r6 = X.C627536m.A01(r14, r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.CapturePhoto"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_file_uri"
            r2.putExtra(r0, r6)
            android.content.Intent r6 = r2.putExtra(r5, r9)
            r1 = 2131887469(0x7f12056d, float:1.9409546E38)
            r0 = 2131232060(0x7f08053c, float:1.8080219E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r6)
            android.content.res.Resources r1 = r14.getResources()
            int r0 = X.AnonymousClass5Yj.A00(r14)
            r2.A01(r1, r0)
            X.5dk r0 = r2.A00()
            r8.add(r0)
        L_0x00ba:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            android.content.Intent r1 = r2.putExtra(r5, r9)
            java.lang.String r0 = "photo_type"
            int r5 = r13.A01()
            android.content.Intent r1 = r1.putExtra(r0, r5)
            java.lang.String r0 = "photo_update_surface_type"
            android.content.Intent r6 = r1.putExtra(r0, r10)
            r1 = 2131889521(0x7f120d71, float:1.9413708E38)
            r0 = 2131231858(0x7f080472, float:1.8079809E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r6)
            android.content.res.Resources r1 = r14.getResources()
            r7 = 2130970369(0x7f040701, float:1.7549446E38)
            r6 = 2131102218(0x7f060a0a, float:1.7816868E38)
            int r0 = X.AnonymousClass5Yj.A02(r14, r7, r6)
            r2.A01(r1, r0)
            X.5dk r0 = r2.A00()
            r8.add(r0)
            boolean r0 = r13.A0A(r10, r3)
            if (r0 == 0) goto L_0x013f
            android.content.Intent r9 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
            r9.setClassName(r1, r0)
            r1 = 2131886512(0x7f1201b0, float:1.9407605E38)
            r0 = 2131231882(0x7f08048a, float:1.8079858E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r9)
            android.content.res.Resources r1 = r14.getResources()
            int r0 = X.AnonymousClass5Yj.A02(r14, r7, r6)
            r2.A01(r1, r0)
            X.2gs r0 = r13.A08
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 == 0) goto L_0x0132
            r0 = 17
        L_0x0132:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.5dk r0 = r2.A00()
            r8.add(r0)
        L_0x013f:
            if (r21 != 0) goto L_0x0143
            if (r3 == 0) goto L_0x01c1
        L_0x0143:
            X.2ro r0 = r13.A04
            java.io.File r0 = r0.A02(r15)
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            android.content.Intent r9 = X.C18320x8.A07()
            java.lang.String r0 = "com.whatsapp.group.GroupProfileEmojiEditor"
            r9.setClassName(r14, r0)
            java.lang.String r0 = "emojiEditorImageResult"
            r9.putExtra(r0, r1)
            java.lang.String r0 = "emojiEditorProfileTarget"
            r1 = r17
            r9.putExtra(r0, r1)
            r1 = 2131890006(0x7f120f56, float:1.9414692E38)
            r0 = 2131232185(0x7f0805b9, float:1.8080472E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r9)
            android.content.res.Resources r1 = r14.getResources()
            int r0 = X.AnonymousClass5Yj.A02(r14, r7, r6)
            r2.A01(r1, r0)
            X.5dk r0 = r2.A00()
            r8.add(r0)
            if (r15 == 0) goto L_0x0207
            java.lang.String r10 = r15.A0J()
        L_0x0185:
            java.io.File r0 = r13.A03(r15)
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            android.content.Intent r9 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.WebImagePicker"
            r9.setClassName(r1, r0)
            java.lang.String r0 = "output"
            r9.putExtra(r0, r2)
            java.lang.String r0 = "query"
            r9.putExtra(r0, r10)
            r1 = 2131893382(0x7f121c86, float:1.9421539E38)
            r0 = 2131231776(0x7f080420, float:1.8079643E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r9)
            android.content.res.Resources r1 = r14.getResources()
            int r0 = X.AnonymousClass5Yj.A02(r14, r7, r6)
            r2.A01(r1, r0)
            X.5dk r0 = r2.A00()
            r8.add(r0)
        L_0x01c1:
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x01f6
            if (r4 == 0) goto L_0x0371
        L_0x01ca:
            r1 = 2131887979(0x7f12076b, float:1.941058E38)
        L_0x01cd:
            X.0df r3 = r14.getSupportFragmentManager()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "title_resource"
            r2.putInt(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r8)
            java.lang.String r0 = "choosable_intents"
            r2.putParcelableArrayList(r0, r1)
            java.lang.String r0 = "request_code"
            r1 = r16
            r2.putInt(r0, r1)
            com.whatsapp.IntentChooserBottomSheetDialogFragment r0 = new com.whatsapp.IntentChooserBottomSheetDialogFragment
            r0.<init>()
            r0.A0u(r2)
            X.AnonymousClass344.A00(r0, r3)
            return
        L_0x01f6:
            if (r5 == 0) goto L_0x038c
            r0 = 2
            if (r5 == r0) goto L_0x0387
            X.5rC r0 = r13.A00
            r0.A04()
            java.lang.String r0 = "getCoverPhotoStringId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0207:
            java.lang.String r10 = "icon"
            goto L_0x0185
        L_0x020b:
            int r2 = r13.A01()
            android.content.Intent r5 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ResetPhoto"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "photo_type"
            r5.putExtra(r0, r2)
            goto L_0x004e
        L_0x0223:
            if (r15 == 0) goto L_0x022c
            boolean r0 = r13.A0B(r15)
            r1 = 1
            if (r0 != 0) goto L_0x0044
        L_0x022c:
            r1 = 0
            goto L_0x0044
        L_0x022f:
            r3 = 0
            goto L_0x0033
        L_0x0232:
            r7 = 1
            if (r15 == 0) goto L_0x036d
            boolean r0 = r15.A0U()
            if (r0 == 0) goto L_0x036d
            r6 = 1
            X.2Ls r0 = r15.A0J
            if (r0 == 0) goto L_0x036e
        L_0x0240:
            r0 = 2
            if (r10 != r0) goto L_0x0361
            X.2ro r0 = r13.A04
            X.3Dh r1 = r0.A00
            java.lang.String r0 = "tmpp"
            java.io.File r0 = r1.A0S(r0)
            boolean r1 = r0.exists()
        L_0x0251:
            if (r19 == 0) goto L_0x0269
            if (r1 == 0) goto L_0x0269
            if (r6 == 0) goto L_0x0346
            android.content.Intent r3 = A00(r14, r7)
            r2 = 2131893037(0x7f121b2d, float:1.942084E38)
        L_0x025e:
            r1 = 2131231285(0x7f080235, float:1.8078647E38)
            X.5dk r0 = new X.5dk
            r0.<init>(r2, r1, r3)
            r8.add(r0)
        L_0x0269:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            java.lang.String r11 = "should_return_photo_source"
            android.content.Intent r0 = r2.putExtra(r11, r9)
            int r5 = r13.A01()
            java.lang.String r4 = "photo_type"
            android.content.Intent r0 = r0.putExtra(r4, r5)
            java.lang.String r3 = "photo_update_surface_type"
            android.content.Intent r12 = r0.putExtra(r3, r10)
            r2 = 2131889521(0x7f120d71, float:1.9413708E38)
            r1 = 2131232258(0x7f080602, float:1.808062E38)
            X.5dk r0 = new X.5dk
            r0.<init>(r2, r1, r12)
            r8.add(r0)
            java.io.File r0 = r13.A03(r15)
            android.net.Uri r12 = X.C627536m.A01(r14, r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.CapturePhoto"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_file_uri"
            r2.putExtra(r0, r12)
            android.content.Intent r0 = r2.putExtra(r11, r9)
            android.content.Intent r0 = r0.putExtra(r4, r5)
            android.content.Intent r3 = r0.putExtra(r3, r10)
            r2 = 2131887469(0x7f12056d, float:1.9409546E38)
            r1 = 2131232071(0x7f080547, float:1.808024E38)
            X.5dk r0 = new X.5dk
            r0.<init>(r2, r1, r3)
            r8.add(r0)
            boolean r0 = r13.A0A(r10, r6)
            if (r0 == 0) goto L_0x0304
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoActivity"
            r3.setClassName(r1, r0)
            r1 = 2131886512(0x7f1201b0, float:1.9407605E38)
            r0 = 2131231882(0x7f08048a, float:1.8079858E38)
            X.5Ql r2 = new X.5Ql
            r2.<init>(r1, r0, r3)
            X.2gs r0 = r13.A08
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 == 0) goto L_0x02f7
            r0 = 17
        L_0x02f7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.5dk r0 = r2.A00()
            r8.add(r0)
        L_0x0304:
            if (r21 != 0) goto L_0x0308
            if (r6 == 0) goto L_0x033b
        L_0x0308:
            if (r15 == 0) goto L_0x033b
            java.io.File r0 = r13.A03(r15)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            java.lang.String r2 = r15.A0J()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.WebImagePicker"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "output"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "query"
            r3.putExtra(r0, r2)
            r2 = 2131893382(0x7f121c86, float:1.9421539E38)
            r1 = 2131232593(0x7f080751, float:1.80813E38)
            X.5dk r0 = new X.5dk
            r0.<init>(r2, r1, r3)
            r8.add(r0)
        L_0x033b:
            java.lang.String r0 = "profile/photo/updater/run chooser"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r6 == 0) goto L_0x0376
            if (r7 == 0) goto L_0x0371
            goto L_0x01ca
        L_0x0346:
            int r2 = r13.A01()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r14.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ResetPhoto"
            r3.setClassName(r1, r0)
            java.lang.String r0 = "photo_type"
            r3.putExtra(r0, r2)
            r2 = 2131893038(0x7f121b2e, float:1.9420841E38)
            goto L_0x025e
        L_0x0361:
            if (r15 == 0) goto L_0x036a
            boolean r0 = r13.A0B(r15)
            r1 = 1
            if (r0 != 0) goto L_0x0251
        L_0x036a:
            r1 = 0
            goto L_0x0251
        L_0x036d:
            r6 = 0
        L_0x036e:
            r7 = 0
            goto L_0x0240
        L_0x0371:
            r1 = 2131890005(0x7f120f55, float:1.941469E38)
            goto L_0x01cd
        L_0x0376:
            if (r5 == 0) goto L_0x038c
            r0 = 2
            if (r5 == r0) goto L_0x0387
            X.5rC r0 = r13.A00
            r0.A04()
            java.lang.String r0 = "getCoverPhotoStringId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0387:
            r1 = 2131896179(0x7f122773, float:1.9427212E38)
            goto L_0x01cd
        L_0x038c:
            r1 = 2131896250(0x7f1227ba, float:1.9427356E38)
            goto L_0x01cd
        L_0x0391:
            java.io.File r0 = r13.A02()
            goto L_0x000e
        L_0x0397:
            r0 = 0
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105335Un.A08(X.07r, X.3ZH, int, int, int, boolean, boolean, boolean):void");
    }
}
