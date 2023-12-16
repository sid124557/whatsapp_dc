package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;

/* renamed from: X.4Rr  reason: invalid class name */
public final class AnonymousClass4Rr extends RelativeLayout {
    public AnonymousClass4Rr(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.f8nameremoved, this);
        C86604Kt.A0z(context, this, AnonymousClass34K.A00(context));
        C86614Ku.A15(getResources(), this, R.dimen.f6nameremoved);
    }

    public final void setSearchHint(String str) {
        C162457s7.A0J(str, 0);
        C86624Kv.A17(this, str, R.id.search_hint);
    }
}
