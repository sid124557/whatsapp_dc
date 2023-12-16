package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.calling.calllink.CallLinkShareReceiver;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5b5  reason: invalid class name and case insensitive filesystem */
public class C107305b5 {
    public static C94654rh A03(String str, int i, boolean z, boolean z2) {
        C94654rh r1 = new C94654rh();
        r1.A04 = str;
        r1.A03 = Integer.valueOf(i);
        r1.A02 = Boolean.valueOf(z);
        r1.A01 = true;
        r1.A00 = Boolean.valueOf(z2);
        return r1;
    }

    public static void A06(C003203q r7, C56972sr r8, C64773Ex r9, AnonymousClass1VX r10, AnonymousClass3ZF r11, int i) {
        ArrayList arrayList;
        List<AnonymousClass3ZE> A08 = r11.A08();
        ArrayList A0p = AnonymousClass000.A0p(A08);
        for (AnonymousClass3ZE r0 : A08) {
            UserJid A03 = AnonymousClass32Y.A03(r0.A02);
            if (A03 != null && !r8.A0a(A03)) {
                A0p.add(A03);
            }
        }
        if (A0p.size() < r10.A0N(862)) {
            arrayList = AnonymousClass002.A0J(A0p);
        } else {
            arrayList = null;
        }
        A07(r7, r9, (GroupJid) null, A0p, arrayList, i, false);
    }

    public static Intent A00(Context context, String str, String str2, int i, boolean z) {
        IntentSender intentSender;
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.SEND");
        A09.putExtra("android.intent.extra.TEXT", str);
        A09.putExtra("android.intent.extra.SUBJECT", str2);
        C86624Kv.A0j(A09);
        if (Build.VERSION.SDK_INT < 22) {
            intentSender = null;
        } else {
            Intent putExtra = AnonymousClass0x9.A08(context, CallLinkShareReceiver.class).putExtra("extra_entry_point", i).putExtra("extra_is_video", z);
            int i2 = 134217728;
            C624735e.A06(putExtra, 134217728);
            if (C624735e.A01) {
                i2 = 167772160;
            }
            intentSender = PendingIntent.getBroadcast(context, 0, putExtra, i2).getIntentSender();
        }
        return C107395bF.A01(intentSender, (CharSequence) null, Collections.singletonList(A09));
    }

    public static C94514rT A02(String str, int i, int i2, boolean z) {
        C94514rT r1 = new C94514rT();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = Integer.valueOf(C18280x3.A00(z ? 1 : 0));
        r1.A03 = str;
        return r1;
    }

    public static String A05(String str, boolean z) {
        String str2;
        Uri.Builder authority = new Uri.Builder().scheme("https").authority("call.whatsapp.com");
        if (z) {
            str2 = "video";
        } else {
            str2 = "voice";
        }
        return authority.appendPath(str2).appendPath(str).build().toString();
    }

    public static boolean A08(AnonymousClass5ZR r1, boolean z) {
        if (!z) {
            return false;
        }
        if (C107385bE.A02()) {
            if (r1.A02("android.permission.CAMERA") != 0) {
                return true;
            }
            return false;
        } else if (r1.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static Bitmap A01(Context context, AnonymousClass5UX r5, C114015mM r6, AnonymousClass3ZH r7) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(17104902);
        Bitmap A03 = r6.A03(context, r7, dimensionPixelSize, dimensionPixelSize2);
        if (A03 != null) {
            return A03;
        }
        return r5.A04(r7, resources.getDimension(R.dimen.f6nameremoved), Math.min(dimensionPixelSize, dimensionPixelSize2));
    }

    public static C150477Qw A04(C64773Ex r7, AnonymousClass5ZU r8, List list, int i, boolean z) {
        Object[] objArr;
        int i2;
        String A0h;
        ArrayList A0s = AnonymousClass001.A0s();
        int i3 = 0;
        while (i3 < i && i3 < list.size()) {
            AnonymousClass3ZH A0A = r7.A0A((C95814uZ) list.get(i3));
            if (z) {
                A0h = r8.A0H(A0A);
            } else {
                A0h = C18300x5.A0h(r8, A0A);
            }
            A0s.add(A0h);
            i3++;
        }
        if (list.size() > i) {
            int A04 = AnonymousClass002.A04(list, 1);
            Object[] objArr2 = new Object[2];
            objArr2[0] = A0s.get(0);
            AnonymousClass000.A1P(objArr2, AnonymousClass002.A04(list, 1), 1);
            return new C137956pX(objArr2, R.plurals.f9nameremoved, A04);
        }
        if (list.size() == 2) {
            objArr = new Object[2];
            C18280x3.A1M(A0s, objArr);
            i2 = R.string.f11nameremoved;
        } else if (list.size() == 3) {
            objArr = new Object[3];
            C18280x3.A1M(A0s, objArr);
            objArr[2] = A0s.get(2);
            i2 = R.string.f11nameremoved;
        } else if (list.size() == 1) {
            return new C137926pU(C86664Kz.A1M(A0s, 0));
        } else {
            if (list.size() == 0) {
                objArr = new Object[0];
                i2 = R.string.f11nameremoved;
            } else {
                C626936e.A0D(false, "Number of names not supported");
                return null;
            }
        }
        return AnonymousClass4L0.A0N(objArr, i2);
    }

    public static void A07(C003203q r6, C64773Ex r7, GroupJid groupJid, List list, List list2, int i, boolean z) {
        ArrayList A0p = AnonymousClass000.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid A0T = C18310x6.A0T(it);
            if (r7.A0l(A0T) || !z) {
                A0p.add(A0T);
            }
        }
        int size = list.size() - A0p.size();
        Integer valueOf = Integer.valueOf(i);
        C626936e.A0D(AnonymousClass0x7.A1S(A0p), "List must be non empty");
        Intent A07 = C18320x8.A07();
        A07.setClassName(r6.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet");
        A07.putStringArrayListExtra("jids", C627336j.A0A(A0p));
        if (list2 != null && !list2.isEmpty()) {
            A07.putStringArrayListExtra("selected", C627336j.A0A(list2));
        }
        if (groupJid != null) {
            A07.putExtra("source_group_jid", groupJid);
        }
        A07.putExtra("hidden_jids", size);
        A07.putExtra("call_from_ui", valueOf);
        r6.startActivity(A07);
        r6.overridePendingTransition(0, 0);
    }
}
