package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.conversation.comments.CommentActionsBottomSheet;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.6Bq  reason: invalid class name and case insensitive filesystem */
public class C124276Bq implements C84134Bd {
    public Object A00;
    public Object A01;
    public final int A02;

    public C124276Bq(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AwB(Object obj) {
        boolean A1U;
        String str;
        C625435m A012;
        int i;
        switch (this.A02) {
            case 0:
                CommentActionsBottomSheet commentActionsBottomSheet = (CommentActionsBottomSheet) this.A00;
                C95814uZ r6 = (C95814uZ) this.A01;
                Boolean bool = (Boolean) obj;
                C162457s7.A0J(bool, 2);
                AnonymousClass66R r3 = commentActionsBottomSheet.A0c;
                if (!((C89654ea) r3.getValue()).BHW()) {
                    AnonymousClass1VX r5 = commentActionsBottomSheet.A0N;
                    if (r5 != null) {
                        AnonymousClass5XI r2 = new AnonymousClass5XI(r5, r6, "comment_actions_bottom_sheet", bool.booleanValue());
                        r2.A00 = 0;
                        r2.A08 = false;
                        C624134x r0 = commentActionsBottomSheet.A0V;
                        if (r0 == null) {
                            throw C18270x1.A0S("message");
                        }
                        r2.A01 = r0.A0o();
                        r2.A05 = false;
                        r2.A07 = false;
                        C624134x r02 = commentActionsBottomSheet.A0V;
                        if (r02 == null) {
                            throw C18270x1.A0S("message");
                        }
                        r2.A02 = r02.A1J;
                        r2.A03 = new C1233468b(commentActionsBottomSheet, 0);
                        ((C89654ea) r3.getValue()).Boo(r2.A00());
                        return;
                    }
                    throw C18270x1.A0R();
                }
                return;
            case 1:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A00;
                ((AnonymousClass3XA) this.A01).A02();
                deepLinkActivity.A00.removeMessages(1);
                deepLinkActivity.BjL();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                deepLinkActivity.A03.A04();
                if (booleanValue) {
                    throw AnonymousClass001.A0g("getCoexistenceConnectionStatusActivity");
                }
                throw AnonymousClass001.A0g("getCoexistenceOnboardingActivity");
            case 2:
                C620033c r1 = (C620033c) this.A00;
                Number number = (Number) obj;
                if (!((AnonymousClass3QO) this.A01).A06()) {
                    r1.A02.A0E(number.intValue());
                    return;
                } else {
                    Log.d("mediajobmanager/mediaprocessjob transcoding error message suppressed");
                    return;
                }
            case 3:
                C104295Qk r4 = (C104295Qk) this.A00;
                C30471mV r32 = (C30471mV) this.A01;
                File file = (File) obj;
                StringBuilder A0o = AnonymousClass001.A0o();
                C624134x.A0S(r32, "mediafilefindmanager/fixing message ", A0o);
                C18260x0.A1P(A0o, " with file ", file);
                r4.A07.remove(r32);
                C30471mV.A00(r32).A0c = false;
                AnonymousClass33C A002 = C30471mV.A00(r32);
                A002.A0M = false;
                A002.A0F = file;
                A002.A0A = file.length();
                A002.A0Q = true;
                AnonymousClass33C A003 = C30471mV.A00(r32);
                if (r32.A07 == null || A003.A0F == null) {
                    A1U = AnonymousClass001.A1U(AnonymousClass358.A00(r32.A0D, 2));
                } else {
                    A1U = true;
                }
                A002.A0R = A1U;
                r4.A04.A0Y(r32);
                return;
            case 4:
                ((C104295Qk) this.A00).A01((C30471mV) this.A01, (Throwable) obj);
                return;
            case 5:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                mediaViewFragment.A0L.A0D();
                Intent A09 = AnonymousClass0x9.A09("android.intent.action.VIEW");
                A09.setDataAndType((Uri) obj, ((C30471mV) this.A01).A05);
                A09.setFlags(1);
                Context A0G = mediaViewFragment.A0G();
                C1229866p r03 = mediaViewFragment.A1E;
                if (r03 != null) {
                    r03.BWs();
                }
                mediaViewFragment.A0H.A0A(A0G, A09);
                return;
            case 6:
                MediaViewFragment mediaViewFragment2 = (MediaViewFragment) this.A00;
                Uri uri = (Uri) obj;
                mediaViewFragment2.A0L.A0D();
                C18260x0.A1P(AnonymousClass001.A0o(), "MediaViewFragment/launchViewInGalleryIntent/uri ", uri);
                Intent A092 = AnonymousClass0x9.A09("android.intent.action.VIEW");
                byte b = ((C624134x) this.A01).A1I;
                if (b == 1) {
                    str = "image/*";
                    A092.setDataAndType(uri, str);
                } else if (b == 3 || b == 13) {
                    str = "video/*";
                    A092.setDataAndType(uri, str);
                } else if (b != 42 && b != 43) {
                    A092.setData(uri);
                } else {
                    return;
                }
                A092.setFlags(1);
                Context A0G2 = mediaViewFragment2.A0G();
                C1229866p r04 = mediaViewFragment2.A1E;
                if (r04 != null) {
                    r04.BWs();
                }
                mediaViewFragment2.A0H.A0A(A0G2, A092);
                return;
            case 7:
                MediaViewFragment mediaViewFragment3 = (MediaViewFragment) this.A00;
                C624134x r62 = (C624134x) this.A01;
                Boolean bool2 = (Boolean) obj;
                C003203q A0Q = mediaViewFragment3.A0Q();
                if (A0Q != null && !C621433s.A03(A0Q)) {
                    AnonymousClass5XI r22 = new AnonymousClass5XI(mediaViewFragment3.A0z, mediaViewFragment3.A14, "media_viewer", bool2.booleanValue());
                    r22.A00 = 0;
                    r22.A08 = false;
                    r22.A01 = r62.A0o();
                    r22.A05 = false;
                    r22.A07 = false;
                    r22.A02 = r62.A1J;
                    r22.A03 = new C1233468b(mediaViewFragment3, 2);
                    C95814uZ r12 = mediaViewFragment3.A14;
                    if (r12 instanceof C95804uY) {
                        AnonymousClass31A A004 = C56982ss.A00(mediaViewFragment3.A0p, r12);
                        C626936e.A06(A004);
                        r22.A01((AnonymousClass1RL) A004);
                    }
                    AnonymousClass344.A00(r22.A00(), mediaViewFragment3.A0T());
                    return;
                }
                return;
            default:
                C624134x r33 = (C624134x) this.A01;
                C56902sk r8 = (C56902sk) obj;
                C162457s7.A0J(r8, 2);
                C66543Lv r23 = ((C66453Lm) this.A00).A0A;
                C625435m A013 = r8.A01();
                if ((A013 == null || A013.A01 != 13) && ((A012 = r8.A01()) == null || A012.A01 != 24)) {
                    i = 3;
                } else {
                    i = -1;
                }
                r23.A0b(r33, i);
                return;
        }
    }
}
