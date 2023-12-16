package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.0ht  reason: invalid class name and case insensitive filesystem */
public final class C10410ht implements C1230366u {
    public String A00 = "";
    public final C54292oU A01;

    public C10410ht(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public View BEI(View view) {
        C162457s7.A0J(view, 0);
        return view.findViewById(R.id.include_video_setting);
    }

    public void Bmq(String str) {
        C162457s7.A0J(str, 0);
        this.A00 = str;
    }

    public String B8w() {
        return "include_videos";
    }

    public String BAV() {
        return "chat_backup";
    }

    public String BAX() {
        return this.A00;
    }

    public String BBg() {
        String A08 = this.A01.A08(R.string.f11nameremoved);
        C162457s7.A0D(A08);
        return A08;
    }

    public int BDm() {
        return 3;
    }

    public /* synthetic */ boolean BIp() {
        return false;
    }

    public boolean BJM() {
        return AnonymousClass0YV.A0F(this.A01.A06());
    }

    public boolean Bo5() {
        return false;
    }

    public /* synthetic */ Drawable getIcon() {
        return null;
    }

    public /* synthetic */ List B4E() {
        return C100665Bu.A00();
    }
}
