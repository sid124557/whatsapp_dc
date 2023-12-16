package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.95F  reason: invalid class name */
public class AnonymousClass95F extends AnonymousClass0R6 implements C185858uM {
    public Context A00;
    public List A01 = AnonymousClass001.A0s();
    public List A02 = AnonymousClass001.A0s();

    public int A0G() {
        return this.A02.size();
    }

    public int B62(int i) {
        return ((C201719kc) this.A01.get(i)).count;
    }

    public int B83() {
        return this.A01.size();
    }

    public long B84(int i) {
        return -((Calendar) this.A01.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void BNd(C05570Ua r3, int i) {
        ((AnonymousClass95L) r3).A00.setText(this.A01.get(i).toString());
    }

    public void BNf(C05570Ua r3, int i) {
        C191249Ee r32 = (C191249Ee) r3;
        r32.A07((AnonymousClass9NZ) this.A02.get(i), i);
        if (!((AnonymousClass9FT) this.A02.get(i)).A02) {
            r32.A00.setVisibility(8);
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQN(ViewGroup viewGroup) {
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f8nameremoved, viewGroup, false);
        inflate.setClickable(false);
        C86604Kt.A0z(context, inflate, AnonymousClass5Yj.A01(context));
        return new AnonymousClass95L(inflate);
    }

    public AnonymousClass95F(Context context) {
        this.A00 = context;
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C191249Ee(AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
    }

    public /* bridge */ /* synthetic */ boolean Bck(MotionEvent motionEvent, C05570Ua r3, int i) {
        return false;
    }
}
