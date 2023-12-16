package androidx.appcompat.view.menu;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0KC;
import X.AnonymousClass0UD;
import X.AnonymousClass0YY;
import X.C07910d1;
import X.C16480tT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;

public class ListMenuItemView extends LinearLayout implements C16480tT, AbsListView.SelectionBoundsAdjuster {
    public int A00;
    public Context A01;
    public Drawable A02;
    public Drawable A03;
    public LayoutInflater A04;
    public CheckBox A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public RadioButton A0A;
    public TextView A0B;
    public TextView A0C;
    public C07910d1 A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.A04 = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A08;
        if (imageView != null) {
            imageView.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BGB(X.C07910d1 r10, int r11) {
        /*
            r9 = this;
            r9.A0D = r10
            boolean r0 = r10.isVisible()
            int r0 = X.AnonymousClass001.A08(r0)
            r9.setVisibility(r0)
            java.lang.CharSequence r0 = r10.getTitle()
            r9.setTitle(r0)
            boolean r0 = r10.isCheckable()
            r9.setCheckable(r0)
            X.0cz r1 = r10.A0E
            boolean r0 = r1.A0J()
            if (r0 == 0) goto L_0x0130
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x012c
            char r0 = r10.A00
        L_0x002b:
            if (r0 == 0) goto L_0x0130
            X.0d1 r2 = r9.A0D
            X.0cz r8 = r2.A0E
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0130
            boolean r1 = r8.A0I()
            if (r1 == 0) goto L_0x0128
            char r0 = r2.A00
        L_0x003f:
            if (r0 == 0) goto L_0x0130
            r6 = 0
            android.widget.TextView r5 = r9.A0B
            if (r1 == 0) goto L_0x0124
            char r7 = r2.A00
        L_0x0048:
            if (r7 != 0) goto L_0x0079
            java.lang.String r0 = ""
        L_0x004c:
            r5.setText(r0)
        L_0x004f:
            android.widget.TextView r0 = r9.A0B
            int r0 = r0.getVisibility()
            if (r0 == r6) goto L_0x005c
            android.widget.TextView r0 = r9.A0B
            r0.setVisibility(r6)
        L_0x005c:
            android.graphics.drawable.Drawable r0 = r10.getIcon()
            r9.setIcon(r0)
            boolean r0 = r10.isEnabled()
            r9.setEnabled(r0)
            boolean r0 = r10.hasSubMenu()
            r9.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r10.getContentDescription()
            r9.setContentDescription(r0)
            return
        L_0x0079:
            android.content.Context r0 = r8.A0N
            android.content.res.Resources r4 = r0.getResources()
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L_0x0097
            r0 = 2131895628(0x7f12254c, float:1.9426094E38)
            java.lang.String r0 = r4.getString(r0)
            r3.append(r0)
        L_0x0097:
            boolean r0 = r8.A0I()
            if (r0 == 0) goto L_0x0120
            int r8 = r2.A04
        L_0x009f:
            r0 = 2131895624(0x7f122548, float:1.9426086E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00af
            r3.append(r2)
        L_0x00af:
            r0 = 2131895620(0x7f122544, float:1.9426078E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00bf
            r3.append(r2)
        L_0x00bf:
            r0 = 2131895619(0x7f122543, float:1.9426076E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 2
            r0 = r8 & 2
            if (r0 != r1) goto L_0x00ce
            r3.append(r2)
        L_0x00ce:
            r0 = 2131895625(0x7f122549, float:1.9426088E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 1
            r0 = r8 & 1
            if (r0 != r1) goto L_0x00dd
            r3.append(r2)
        L_0x00dd:
            r0 = 2131895627(0x7f12254b, float:1.9426092E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 4
            r0 = r8 & 4
            if (r0 != r1) goto L_0x00ec
            r3.append(r2)
        L_0x00ec:
            r0 = 2131895623(0x7f122547, float:1.9426084E38)
            java.lang.String r1 = r4.getString(r0)
            r2 = 8
            r0 = r8 & 8
            if (r0 != r2) goto L_0x00fc
            r3.append(r1)
        L_0x00fc:
            r1 = 2131895621(0x7f122545, float:1.942608E38)
            if (r7 == r2) goto L_0x0118
            r0 = 10
            r1 = 2131895622(0x7f122546, float:1.9426082E38)
            if (r7 == r0) goto L_0x0118
            r0 = 32
            if (r7 == r0) goto L_0x0115
            r3.append(r7)
        L_0x010f:
            java.lang.String r0 = r3.toString()
            goto L_0x004c
        L_0x0115:
            r1 = 2131895626(0x7f12254a, float:1.942609E38)
        L_0x0118:
            java.lang.String r0 = r4.getString(r1)
            r3.append(r0)
            goto L_0x010f
        L_0x0120:
            int r8 = r2.A05
            goto L_0x009f
        L_0x0124:
            char r7 = r2.A01
            goto L_0x0048
        L_0x0128:
            char r0 = r2.A01
            goto L_0x003f
        L_0x012c:
            char r0 = r10.A01
            goto L_0x002b
        L_0x0130:
            r6 = 8
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.BGB(X.0d1, int):void");
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A06;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(this.A06);
            rect.top += this.A06.getHeight() + A0U.topMargin + A0U.bottomMargin;
        }
    }

    public C07910d1 getItemData() {
        return this.A0D;
    }

    public void onMeasure(int i, int i2) {
        if (this.A07 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(this.A07);
            int i3 = layoutParams.height;
            if (i3 > 0 && A0U.width <= 0) {
                A0U.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (z || this.A0A != null || this.A05 != null) {
            if ((this.A0D.A02 & 4) != 0) {
                if (this.A0A == null) {
                    RadioButton radioButton = (RadioButton) AnonymousClass001.A0R(getInflater(), this, R.layout.f8nameremoved);
                    this.A0A = radioButton;
                    LinearLayout linearLayout = this.A09;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.A0A;
                compoundButton3 = this.A05;
                compoundButton2 = compoundButton3;
            } else {
                if (this.A05 == null) {
                    CheckBox checkBox = (CheckBox) AnonymousClass001.A0R(getInflater(), this, R.layout.f8nameremoved);
                    this.A05 = checkBox;
                    LinearLayout linearLayout2 = this.A09;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.A05;
                compoundButton2 = compoundButton;
                compoundButton3 = this.A0A;
            }
            if (z) {
                compoundButton.setChecked(this.A0D.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton3 != null) {
                    AnonymousClass001.A18(compoundButton3, 8);
                    return;
                }
                return;
            }
            if (compoundButton2 != null) {
                compoundButton2.setVisibility(8);
            }
            RadioButton radioButton2 = this.A0A;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A0D.A02 & 4) != 0) {
            if (this.A0A == null) {
                RadioButton radioButton = (RadioButton) AnonymousClass001.A0R(getInflater(), this, R.layout.f8nameremoved);
                this.A0A = radioButton;
                LinearLayout linearLayout = this.A09;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.A0A;
        } else {
            if (this.A05 == null) {
                CheckBox checkBox = (CheckBox) AnonymousClass001.A0R(getInflater(), this, R.layout.f8nameremoved);
                this.A05 = checkBox;
                LinearLayout linearLayout2 = this.A09;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A05;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A06
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.A0D.A0E.A0H || this.A0E) {
            z = true;
        } else {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A07 == null) {
            if (drawable != null || this.A0G) {
                ImageView imageView = (ImageView) getInflater().inflate(R.layout.f8nameremoved, this, false);
                this.A07 = imageView;
                LinearLayout linearLayout = this.A09;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            } else {
                return;
            }
        }
        if (drawable != null || this.A0G) {
            ImageView imageView2 = this.A07;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.A07.getVisibility() != 0) {
                this.A07.setVisibility(0);
                return;
            }
            return;
        }
        this.A07.setVisibility(8);
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        TextView textView2 = this.A0C;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0C.getVisibility() != 0) {
                textView = this.A0C;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (textView2.getVisibility() != 8) {
                textView = this.A0C;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(getContext(), attributeSet, AnonymousClass0KC.A0G, i, 0);
        this.A02 = A002.A02(5);
        TypedArray typedArray = A002.A02;
        this.A00 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A01 = context;
        this.A03 = A002.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.f3nameremoved, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        AnonymousClass0YY.A04(this.A02, this);
        TextView A092 = AnonymousClass002.A09(this, R.id.title);
        this.A0C = A092;
        int i = this.A00;
        if (i != -1) {
            A092.setTextAppearance(this.A01, i);
        }
        this.A0B = AnonymousClass002.A09(this, R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A08 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A03);
        }
        this.A06 = (ImageView) findViewById(R.id.group_divider);
        this.A09 = (LinearLayout) findViewById(R.id.content);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f3nameremoved);
    }
}
