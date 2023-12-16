package androidx.fragment.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C08310eF;
import X.C10990iv;
import X.C17790wF;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ListFragment extends C08310eF {
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final AdapterView.OnItemClickListener A08 = new C17790wF(this, 1);
    public final Runnable A09 = new C10990iv(this);

    public void A0c() {
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A0X = true;
    }

    public final void A1H() {
        if (this.A04 == null) {
            View view = this.A0B;
            if (view != null) {
                if (view instanceof ListView) {
                    this.A04 = (ListView) view;
                } else {
                    TextView A092 = AnonymousClass002.A09(view, 16711681);
                    this.A05 = A092;
                    if (A092 == null) {
                        this.A00 = view.findViewById(16908292);
                    } else {
                        A092.setVisibility(8);
                    }
                    this.A02 = view.findViewById(16711682);
                    this.A01 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.A04 = listView;
                        View view2 = this.A00;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw AnonymousClass002.A0E("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw AnonymousClass002.A0E("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.A06 = true;
                this.A04.setOnItemClickListener(this.A08);
                ListAdapter listAdapter = this.A03;
                if (listAdapter != null) {
                    this.A03 = null;
                    A1I(listAdapter);
                } else if (this.A02 != null) {
                    A1H();
                    View view3 = this.A02;
                    if (view3 == null) {
                        throw AnonymousClass001.A0e("Can't be used with a custom content view");
                    } else if (this.A06) {
                        this.A06 = false;
                        view3.clearAnimation();
                        this.A01.clearAnimation();
                        this.A02.setVisibility(0);
                        this.A01.setVisibility(8);
                    }
                }
                this.A07.post(this.A09);
                return;
            }
            throw AnonymousClass001.A0e("Content view not yet created");
        }
    }

    public void A1I(ListAdapter listAdapter) {
        boolean z = false;
        boolean A1W = AnonymousClass000.A1W(this.A03);
        this.A03 = listAdapter;
        ListView listView = this.A04;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !A1W) {
                if (A0J().getWindowToken() != null) {
                    z = true;
                }
                A1H();
                View view = this.A02;
                if (view == null) {
                    throw AnonymousClass001.A0e("Can't be used with a custom content view");
                } else if (!this.A06) {
                    this.A06 = true;
                    if (z) {
                        view.startAnimation(AnimationUtils.loadAnimation(A1D(), 17432577));
                        this.A01.startAnimation(AnimationUtils.loadAnimation(A1D(), 17432576));
                    } else {
                        view.clearAnimation();
                        this.A01.clearAnimation();
                    }
                    this.A02.setVisibility(8);
                    this.A01.setVisibility(0);
                }
            }
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context A0G = A0G();
        FrameLayout frameLayout = new FrameLayout(A0G);
        LinearLayout linearLayout = new LinearLayout(A0G);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(A0G, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(A0G);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(A0G);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(A0G);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void A0w(Bundle bundle, View view) {
        A1H();
    }
}
