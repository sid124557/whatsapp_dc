package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02P;
import X.AnonymousClass031;
import X.AnonymousClass034;
import X.AnonymousClass07X;
import X.AnonymousClass0T7;
import X.C009007d;
import X.C10800iX;
import X.C14540pr;
import X.C14550ps;
import X.C16450tQ;
import X.C16510tW;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements C16450tQ {
    public static final AnonymousClass0T7 A0o;
    public int A00;
    public int A01;
    public SearchableInfo A02;
    public Rect A03;
    public Rect A04;
    public Bundle A05;
    public TextWatcher A06;
    public View.OnClickListener A07;
    public View.OnFocusChangeListener A08;
    public View.OnKeyListener A09;
    public C14540pr A0A;
    public C16510tW A0B;
    public C14550ps A0C;
    public AnonymousClass02P A0D;
    public AnonymousClass034 A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Runnable A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int[] A0Q;
    public int[] A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View.OnClickListener A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final View A0b;
    public final AdapterView.OnItemClickListener A0c;
    public final AdapterView.OnItemSelectedListener A0d;
    public final ImageView A0e;
    public final ImageView A0f;
    public final ImageView A0g;
    public final ImageView A0h;
    public final ImageView A0i;
    public final TextView.OnEditorActionListener A0j;
    public final SearchAutoComplete A0k;
    public final CharSequence A0l;
    public final Runnable A0m;
    public final WeakHashMap A0n;

    public class SearchAutoComplete extends AnonymousClass031 {
        public int A00;
        public SearchView A01;
        public boolean A02;
        public final Runnable A03;

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A01.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            AnonymousClass0T7 r0 = SearchView.A0o;
            AnonymousClass0T7.A00();
            Method method = r0.A02;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            if (this.A00 <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        public void performCompletion() {
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.A03 = new C10800iX(this);
            this.A00 = getThreshold();
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int getSearchViewTextMinWidthDp() {
            /*
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r3 = r0.getConfiguration()
                int r2 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r0 = 960(0x3c0, float:1.345E-42)
                if (r2 < r0) goto L_0x001e
                r0 = 720(0x2d0, float:1.009E-42)
                if (r1 < r0) goto L_0x001b
                int r2 = r3.orientation
                r0 = 2
                r1 = 256(0x100, float:3.59E-43)
                if (r2 == r0) goto L_0x001d
            L_0x001b:
                r1 = 192(0xc0, float:2.69E-43)
            L_0x001d:
                return r1
            L_0x001e:
                r0 = 600(0x258, float:8.41E-43)
                r1 = 160(0xa0, float:2.24E-43)
                if (r2 < r0) goto L_0x001d
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.getSearchViewTextMinWidthDp():int");
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A02) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.A01;
            searchView.A0K(searchView.A0L());
            searchView.post(searchView.A0m);
            if (searchView.A0k.hasFocus()) {
                searchView.A07();
            }
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.A01.hasFocus() && getVisibility() == 0) {
                this.A02 = true;
                if (AnonymousClass001.A0M(getContext()).orientation == 2) {
                    A00();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager A0C = AnonymousClass000.A0C(this);
            if (!z) {
                this.A02 = false;
                removeCallbacks(this.A03);
                A0C.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (A0C.isActive(this)) {
                this.A02 = false;
                removeCallbacks(this.A03);
                A0C.showSoftInput(this, 0);
            } else {
                this.A02 = true;
            }
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A00 = i;
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setSearchView(SearchView searchView) {
            this.A01 = searchView;
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.f3nameremoved);
        }
    }

    public void A09() {
        A0K(false);
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A07;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r1 == null) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(int r10) {
        /*
            r9 = this;
            r4 = 0
            r7 = 0
            X.034 r0 = r9.A0E
            android.database.Cursor r5 = r0.A02
            if (r5 == 0) goto L_0x00de
            boolean r0 = r5.moveToPosition(r10)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "suggest_intent_action"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r8 = X.AnonymousClass07X.A01(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r8 != 0) goto L_0x0024
            android.app.SearchableInfo r0 = r9.A02     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r8 = r0.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x00af }
            if (r8 != 0) goto L_0x0024
            java.lang.String r8 = "android.intent.action.SEARCH"
        L_0x0024:
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r1 = X.AnonymousClass07X.A01(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r1 != 0) goto L_0x0038
            android.app.SearchableInfo r0 = r9.A02     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r1 = r0.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x0057
        L_0x0038:
            java.lang.String r0 = "suggest_intent_data_id"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r2 = X.AnonymousClass07X.A01(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r2 == 0) goto L_0x0076
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ RuntimeException -> 0x00af }
            if (r1 != 0) goto L_0x0076
        L_0x0057:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r6 = X.AnonymousClass07X.A01(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00af }
            java.lang.String r2 = X.AnonymousClass07X.A01(r5, r0)     // Catch:{ RuntimeException -> 0x00af }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ RuntimeException -> 0x00af }
            r3.<init>(r8)     // Catch:{ RuntimeException -> 0x00af }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x007b
        L_0x0076:
            android.net.Uri r7 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x00af }
            goto L_0x0057
        L_0x007b:
            if (r7 == 0) goto L_0x0080
            r3.setData(r7)     // Catch:{ RuntimeException -> 0x00af }
        L_0x0080:
            java.lang.String r1 = "user_query"
            java.lang.CharSequence r0 = r9.A0H     // Catch:{ RuntimeException -> 0x00af }
            r3.putExtra(r1, r0)     // Catch:{ RuntimeException -> 0x00af }
            if (r6 == 0) goto L_0x008e
            java.lang.String r0 = "query"
            r3.putExtra(r0, r6)     // Catch:{ RuntimeException -> 0x00af }
        L_0x008e:
            if (r2 == 0) goto L_0x0095
            java.lang.String r0 = "intent_extra_data_key"
            r3.putExtra(r0, r2)     // Catch:{ RuntimeException -> 0x00af }
        L_0x0095:
            android.os.Bundle r1 = r9.A05     // Catch:{ RuntimeException -> 0x00af }
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "app_data"
            r3.putExtra(r0, r1)     // Catch:{ RuntimeException -> 0x00af }
        L_0x009e:
            android.app.SearchableInfo r0 = r9.A02     // Catch:{ RuntimeException -> 0x00af }
            android.content.ComponentName r0 = r0.getSearchActivity()     // Catch:{ RuntimeException -> 0x00af }
            r3.setComponent(r0)     // Catch:{ RuntimeException -> 0x00af }
            android.content.Context r0 = r9.getContext()     // Catch:{ RuntimeException -> 0x00ce }
            r0.startActivity(r3)     // Catch:{ RuntimeException -> 0x00ce }
            goto L_0x00de
        L_0x00af:
            r3 = move-exception
            int r2 = r5.getPosition()     // Catch:{ RuntimeException -> 0x00b5 }
            goto L_0x00b6
        L_0x00b5:
            r2 = -1
        L_0x00b6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Search suggestions cursor at row "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " returned exception."
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.String r0 = "SearchView"
            android.util.Log.w(r0, r1, r3)
            goto L_0x00de
        L_0x00ce:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed launch activity: "
            java.lang.String r1 = X.AnonymousClass000.A0P(r3, r0, r1)
            java.lang.String r0 = "SearchView"
            android.util.Log.e(r0, r1, r2)
        L_0x00de:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r9.A0k
            r0.setImeVisibility(r4)
            r0.dismissDropDown()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.A0M(int):boolean");
    }

    public void clearFocus() {
        this.A0J = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0J = false;
    }

    static {
        AnonymousClass0T7 r0;
        if (Build.VERSION.SDK_INT < 29) {
            r0 = new AnonymousClass0T7();
        } else {
            r0 = null;
        }
        A0o = r0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r10 = r19
            r2 = r20
            r3 = r21
            r1 = r22
            r10.<init>(r2, r3, r1)
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r10.A03 = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A0N()
            r10.A04 = r0
            r4 = 2
            int[] r0 = new int[r4]
            r10.A0Q = r0
            int[] r0 = new int[r4]
            r10.A0R = r0
            X.0iV r0 = new X.0iV
            r0.<init>(r10)
            r10.A0m = r0
            X.0iW r0 = new X.0iW
            r0.<init>(r10)
            r10.A0I = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r10.A0n = r0
            r9 = 1
            X.0wC r11 = new X.0wC
            r11.<init>(r10, r9)
            r10.A0X = r11
            r8 = 0
            X.0wp r0 = new X.0wp
            r0.<init>(r10, r8)
            r10.A09 = r0
            X.0w7 r18 = new X.0w7
            r0 = r18
            r0.<init>(r10, r8)
            r10.A0j = r0
            X.0wF r12 = new X.0wF
            r12.<init>(r10, r8)
            r10.A0c = r12
            X.0MU r7 = new X.0MU
            r7.<init>(r10, r9)
            r10.A0d = r7
            X.0wx r0 = new X.0wx
            r0.<init>(r10, r8)
            r10.A06 = r0
            int[] r0 = X.AnonymousClass0KC.A0J
            X.0UD r13 = X.AnonymousClass0UD.A00(r2, r3, r0, r1, r8)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1 = 17
            r0 = 2131623961(0x7f0e0019, float:1.8875088E38)
            android.content.res.TypedArray r6 = r13.A02
            int r0 = r6.getResourceId(r1, r0)
            r2.inflate(r0, r10, r9)
            r0 = 2131433354(0x7f0b178a, float:1.8488491E38)
            android.view.View r5 = r10.findViewById(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r5 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r5
            r10.A0k = r5
            r5.A01 = r10
            r0 = 2131433288(0x7f0b1748, float:1.8488357E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A0Z = r0
            r0 = 2131433335(0x7f0b1777, float:1.8488453E38)
            android.view.View r17 = r10.findViewById(r0)
            r0 = r17
            r10.A0a = r0
            r0 = 2131434078(0x7f0b1a5e, float:1.848996E38)
            android.view.View r16 = r10.findViewById(r0)
            r0 = r16
            r10.A0b = r0
            r0 = 2131433270(0x7f0b1736, float:1.848832E38)
            android.view.View r14 = r10.findViewById(r0)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r10.A0h = r14
            r0 = 2131433296(0x7f0b1750, float:1.8488374E38)
            android.view.View r4 = r10.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r10.A0g = r4
            r0 = 2131433278(0x7f0b173e, float:1.8488337E38)
            android.view.View r3 = r10.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r10.A0e = r3
            r0 = 2131433374(0x7f0b179e, float:1.8488532E38)
            android.view.View r2 = r10.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r10.A0i = r2
            r0 = 2131433309(0x7f0b175d, float:1.84884E38)
            android.view.View r1 = r10.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r10.A0f = r1
            r0 = 18
            android.graphics.drawable.Drawable r0 = r13.A02(r0)
            r15 = r0
            r0 = r17
            X.AnonymousClass0YY.A04(r15, r0)
            r0 = 23
            android.graphics.drawable.Drawable r0 = r13.A02(r0)
            r15 = r0
            r0 = r16
            X.AnonymousClass0YY.A04(r15, r0)
            r15 = 21
            android.graphics.drawable.Drawable r0 = r13.A02(r15)
            r14.setImageDrawable(r0)
            r0 = 13
            android.graphics.drawable.Drawable r0 = r13.A02(r0)
            r4.setImageDrawable(r0)
            r0 = 10
            android.graphics.drawable.Drawable r0 = r13.A02(r0)
            r3.setImageDrawable(r0)
            r0 = 26
            android.graphics.drawable.Drawable r0 = r13.A02(r0)
            r2.setImageDrawable(r0)
            android.graphics.drawable.Drawable r0 = r13.A02(r15)
            r1.setImageDrawable(r0)
            r0 = 20
            android.graphics.drawable.Drawable r0 = r13.A02(r0)
            r10.A0W = r0
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131895632(0x7f122550, float:1.9426102E38)
            java.lang.String r0 = r1.getString(r0)
            X.C02550Gr.A00(r14, r0)
            r1 = 24
            r0 = 2131623960(0x7f0e0018, float:1.8875086E38)
            int r0 = r6.getResourceId(r1, r0)
            r10.A0T = r0
            r0 = 11
            int r0 = r6.getResourceId(r0, r8)
            r10.A0S = r0
            r14.setOnClickListener(r11)
            r3.setOnClickListener(r11)
            r4.setOnClickListener(r11)
            r2.setOnClickListener(r11)
            r5.setOnClickListener(r11)
            android.text.TextWatcher r0 = r10.A06
            r5.addTextChangedListener(r0)
            r0 = r18
            r5.setOnEditorActionListener(r0)
            r5.setOnItemClickListener(r12)
            r5.setOnItemSelectedListener(r7)
            android.view.View$OnKeyListener r0 = r10.A09
            r5.setOnKeyListener(r0)
            X.0aG r0 = new X.0aG
            r0.<init>(r10)
            r5.setOnFocusChangeListener(r0)
            r0 = 16
            boolean r0 = r6.getBoolean(r0, r9)
            r10.setIconifiedByDefault(r0)
            r1 = -1
            r0 = 2
            int r0 = r6.getDimensionPixelSize(r0, r1)
            if (r0 == r1) goto L_0x018a
            r10.setMaxWidth(r0)
        L_0x018a:
            r0 = 12
            java.lang.CharSequence r0 = r6.getText(r0)
            r10.A0l = r0
            r0 = 19
            java.lang.CharSequence r0 = r6.getText(r0)
            r10.A0G = r0
            r0 = 6
            int r0 = r6.getInt(r0, r1)
            if (r0 == r1) goto L_0x01a4
            r10.setImeOptions(r0)
        L_0x01a4:
            r0 = 5
            int r0 = r6.getInt(r0, r1)
            if (r0 == r1) goto L_0x01ae
            r10.setInputType(r0)
        L_0x01ae:
            boolean r0 = r6.getBoolean(r9, r9)
            r10.setFocusable(r0)
            r6.recycle()
            java.lang.String r0 = "android.speech.action.WEB_SEARCH"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r10.A0V = r3
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r2)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r10.A0U = r0
            r0.addFlags(r2)
            int r0 = r5.getDropDownAnchor()
            android.view.View r1 = r10.findViewById(r0)
            r10.A0Y = r1
            if (r1 == 0) goto L_0x01ed
            X.0aK r0 = new X.0aK
            r0.<init>(r10)
            r1.addOnLayoutChangeListener(r0)
        L_0x01ed:
            boolean r0 = r10.A0M
            r10.A0K(r0)
            r10.A0D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void A07() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0k.refreshAutoCompleteResults();
            return;
        }
        AnonymousClass0T7 r3 = A0o;
        SearchAutoComplete searchAutoComplete = this.A0k;
        AnonymousClass0T7.A00();
        Method method = r3.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        AnonymousClass0T7.A00();
        Method method2 = r3.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void A08() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.A0M && this.A0A == null) {
            clearFocus();
            A0K(true);
        }
    }

    public void A0A() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C16510tW r1 = this.A0B;
            if (r1 == null || !r1.BZK(text.toString())) {
                if (this.A02 != null) {
                    A0I(text.toString());
                }
                searchAutoComplete.setImeVisibility(false);
                searchAutoComplete.dismissDropDown();
            }
        }
    }

    public void A0B() {
        int[] iArr;
        if (this.A0k.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.A0a.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0b.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void A0C() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.A0k.getText());
        int i = 0;
        if (!z2 && (!this.A0M || this.A0K)) {
            z = false;
        }
        ImageView imageView = this.A0e;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void A0E() {
        int i;
        if ((this.A0O || this.A0P) && !A0L() && (this.A0g.getVisibility() == 0 || this.A0i.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.A0b.setVisibility(i);
    }

    public void A0F(int i) {
        CharSequence Azk;
        Editable text = this.A0k.getText();
        Cursor cursor = this.A0E.A02;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i) || (Azk = this.A0E.Azk(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(Azk);
        }
    }

    public void A0H(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.A0H = charSequence;
        }
    }

    public void A0I(String str) {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("user_query", this.A0H);
        if (str != null) {
            intent.putExtra("query", str);
        }
        Bundle bundle = this.A05;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A02.getSearchActivity());
        getContext().startActivity(intent);
    }

    public final void A0J(boolean z) {
        int i;
        if (!this.A0O || A0L() || !hasFocus() || (!z && this.A0P)) {
            i = 8;
        } else {
            i = 0;
        }
        this.A0g.setVisibility(i);
    }

    public final void A0K(boolean z) {
        this.A0L = z;
        int i = 0;
        int A082 = AnonymousClass001.A08(z ? 1 : 0);
        boolean z2 = !TextUtils.isEmpty(this.A0k.getText());
        this.A0h.setVisibility(A082);
        A0J(z2);
        View view = this.A0Z;
        int i2 = 0;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        ImageView imageView = this.A0f;
        if (imageView.getDrawable() == null || this.A0M) {
            i = 8;
        }
        imageView.setVisibility(i);
        A0C();
        boolean z3 = !z2;
        int i3 = 8;
        if (this.A0P && !A0L() && z3) {
            this.A0g.setVisibility(8);
            i3 = 0;
        }
        this.A0i.setVisibility(i3);
        A0E();
    }

    public boolean A0L() {
        return this.A0L;
    }

    public int getImeOptions() {
        return this.A0k.getImeOptions();
    }

    public int getInputType() {
        return this.A0k.getInputType();
    }

    public int getMaxWidth() {
        return this.A01;
    }

    public CharSequence getQuery() {
        return this.A0k.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0G;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A02;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.A0l;
        }
        return getContext().getText(this.A02.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public AnonymousClass034 getSuggestionsAdapter() {
        return this.A0E;
    }

    public void onActionViewCollapsed() {
        A0H("");
        clearFocus();
        A0K(true);
        this.A0k.setImeOptions(this.A00);
        this.A0K = false;
    }

    public void onActionViewExpanded() {
        if (!this.A0K) {
            this.A0K = true;
            SearchAutoComplete searchAutoComplete = this.A0k;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A00 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            A09();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0m);
        post(this.A0I);
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C009007d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C009007d r2 = (C009007d) parcelable;
        super.onRestoreInstanceState(r2.A00);
        A0K(r2.A00);
        requestLayout();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.A0J || !isFocusable()) {
            return false;
        }
        if (A0L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.A0k.requestFocus(i, rect);
        if (requestFocus) {
            A0K(false);
        }
        return requestFocus;
    }

    public void setIconified(boolean z) {
        if (z) {
            A08();
        } else {
            A09();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A0M != z) {
            this.A0M = z;
            A0K(z);
            A0D();
        }
    }

    public void setImeOptions(int i) {
        this.A0k.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0k.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0G = charSequence;
        A0D();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0N = z;
        AnonymousClass034 r1 = this.A0E;
        if (r1 instanceof AnonymousClass07X) {
            AnonymousClass07X r12 = (AnonymousClass07X) r1;
            int i = 1;
            if (z) {
                i = 2;
            }
            r12.A03 = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.A02 = searchableInfo;
        if (searchableInfo != null) {
            SearchAutoComplete searchAutoComplete = this.A0k;
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.A02.getImeOptions());
            int inputType = this.A02.getInputType();
            int i = 1;
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.A02.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AnonymousClass034 r1 = this.A0E;
            if (r1 != null) {
                r1.Ayj((Cursor) null);
            }
            if (this.A02.getSuggestAuthority() != null) {
                AnonymousClass07X r0 = new AnonymousClass07X(this.A02, getContext(), this, this.A0n);
                this.A0E = r0;
                searchAutoComplete.setAdapter(r0);
                AnonymousClass07X r12 = (AnonymousClass07X) this.A0E;
                if (this.A0N) {
                    i = 2;
                }
                r12.A03 = i;
            }
            A0D();
        }
        SearchableInfo searchableInfo2 = this.A02;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.A02.getVoiceSearchLaunchWebSearch()) {
                intent = this.A0V;
            } else if (this.A02.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0U;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null)) {
                z = true;
            }
        }
        this.A0P = z;
        if (z) {
            this.A0k.setPrivateImeOptions("nm");
        }
        A0K(A0L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0O = z;
        A0K(A0L());
    }

    public void setSuggestionsAdapter(AnonymousClass034 r2) {
        this.A0E = r2;
        this.A0k.setAdapter(r2);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public final void A0D() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A0M && (drawable = this.A0W) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0k;
            Rect rect = this.A03;
            int[] iArr = this.A0Q;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0R;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            Rect rect2 = this.A04;
            rect2.set(rect.left, 0, rect.right, i4 - i2);
            AnonymousClass02P r2 = this.A0D;
            if (r2 == null) {
                AnonymousClass02P r0 = new AnonymousClass02P(rect2, rect, searchAutoComplete);
                this.A0D = r0;
                setTouchDelegate(r0);
                return;
            }
            r2.A04.set(rect2);
            Rect rect3 = r2.A03;
            rect3.set(rect2);
            int i7 = -r2.A01;
            rect3.inset(i7, i7);
            r2.A02.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 > 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.A0L()
            if (r0 != 0) goto L_0x0038
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x004e
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0020
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x0020
        L_0x001c:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0020:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r3) goto L_0x003c
            if (r0 != 0) goto L_0x0030
            int r1 = r5.getPreferredHeight()
        L_0x0030:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L_0x0038:
            super.onMeasure(r6, r7)
            return
        L_0x003c:
            int r0 = r5.getPreferredHeight()
            int r1 = java.lang.Math.min(r0, r1)
            goto L_0x0030
        L_0x0045:
            int r4 = r5.A01
            if (r4 > 0) goto L_0x0020
            int r4 = r5.getPreferredWidth()
            goto L_0x0020
        L_0x004e:
            int r0 = r5.A01
            if (r0 > 0) goto L_0x001c
            int r0 = r5.getPreferredWidth()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public Parcelable onSaveInstanceState() {
        C009007d r1 = new C009007d(super.onSaveInstanceState());
        r1.A00 = A0L();
        return r1;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.A0m);
    }

    public void A0G(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.A05 = bundle;
    }

    public void setOnCloseListener(C14540pr r1) {
        this.A0A = r1;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A08 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C16510tW r1) {
        this.A0B = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A07 = onClickListener;
    }

    public void setOnSuggestionListener(C14550ps r1) {
        this.A0C = r1;
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
