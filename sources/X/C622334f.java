package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.34f  reason: invalid class name and case insensitive filesystem */
public class C622334f {
    public final C56972sr A00;
    public final AnonymousClass314 A01;
    public final C28711he A02;
    public final AnonymousClass33p A03;
    public final C56982ss A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass4FS A06;

    public static void A00(Context context, View view, C621033m r7, C95814uZ r8, Integer num, String str) {
        C88694ab A012 = C88694ab.A01(view, str, 0);
        A012.A0F(context.getString(R.string.f11nameremoved), new AnonymousClass547(r7, r8, num, 18));
        A012.A0D(C18300x5.A03(context, R.attr.f3nameremoved, R.color.f5nameremoved));
        TextView A09 = AnonymousClass002.A09(A012.A0J, R.id.snackbar_text);
        A09.setSingleLine(false);
        A012.A05();
        A09.requestFocus();
    }

    public void A02() {
        if (!this.A00.A0Y()) {
            AnonymousClass33p r3 = this.A03;
            C18270x1.A0l(C18270x1.A03(r3), "archive_v2_enabled", true);
            C18270x1.A0l(C18270x1.A03(r3), "notify_new_message_for_archived_chats", false);
            AnonymousClass4FS r32 = this.A06;
            C28711he r2 = this.A02;
            Objects.requireNonNull(r2);
            r32.BkM(new C117625sE(r2, 25));
        }
    }

    public void A03(boolean z) {
        C626936e.A0F(!this.A00.A0Y(), "archiveutil/setArchiveModeAndUpdateCompanion only primary can set this setting");
        C18270x1.A0l(C18270x1.A03(this.A03), "notify_new_message_for_archived_chats", z);
        AnonymousClass4FS r3 = this.A06;
        C28711he r2 = this.A02;
        Objects.requireNonNull(r2);
        r3.BkM(new C117625sE(r2, 25));
        AnonymousClass4FV r22 = this.A05;
        AnonymousClass1W0 r1 = new AnonymousClass1W0();
        r1.A00 = Boolean.valueOf(!z);
        r22.BhD(r1);
    }

    public C622334f(C56972sr r1, AnonymousClass314 r2, C28711he r3, AnonymousClass33p r4, C56982ss r5, AnonymousClass4FV r6, AnonymousClass4FS r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static boolean A01(AnonymousClass33p r1, C56982ss r2, C95814uZ r3) {
        if (!r1.A28() || C18280x3.A1W(AnonymousClass0x2.A0F(r1), "notify_new_message_for_archived_chats") || !r2.A0M(r3)) {
            return false;
        }
        return true;
    }
}
