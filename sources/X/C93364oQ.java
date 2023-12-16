package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4oQ  reason: invalid class name and case insensitive filesystem */
public class C93364oQ extends AnonymousClass4RB {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass4FP A03;
    public C620733j A04;
    public AnonymousClass1VX A05;
    public AnonymousClass5QQ A06;
    public List A07;
    public List A08;
    public boolean A09 = true;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    public C93364oQ(Context context) {
        super(context);
        LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
        setGravity(17);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        setLayoutParams(A0C2);
        setOrientation(0);
        setBackgroundResource(R.drawable.reaction_bubble_background);
        this.A02 = C86634Kw.A07(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        int i = this.A02;
        setPadding(i, dimensionPixelSize, i, dimensionPixelSize);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        setVisibility(8);
        setId(R.id.reactions_bubble_layout);
        setClipToPadding(false);
        setClipChildren(false);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
        }
    }

    public void setAreAnimationsEnabled(boolean z) {
        this.A09 = z;
    }
}
