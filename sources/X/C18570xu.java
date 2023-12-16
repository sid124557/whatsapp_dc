package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: X.0xu  reason: invalid class name and case insensitive filesystem */
public class C18570xu extends Resources {
    public Resources A00;
    public final C620733j A01;

    public static final int A00(int i) {
        AnonymousClass2GD r0;
        Number number;
        if (!C1001059l.A04 || (r0 = C1001059l.A00) == null || (number = (Number) AnonymousClass001.A0i(AnonymousClass0x7.A10(r0.A00), i)) == null) {
            return i;
        }
        return number.intValue();
    }

    public static Resources A01(Resources resources) {
        if (resources instanceof C18570xu) {
            return ((C18570xu) resources).A00;
        }
        return resources;
    }

    public static C18570xu A02(Resources resources, C620733j r2) {
        if (resources == null || r2 == null) {
            throw AnonymousClass001.A0g("Resources and/or WhatsAppLocale can't be null");
        } else if (resources instanceof C18570xu) {
            return (C18570xu) resources;
        } else {
            return new C18570xu(resources, r2);
        }
    }

    public XmlResourceParser getAnimation(int i) {
        return this.A00.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.A00.getBoolean(i);
    }

    public int getColor(int i) {
        return this.A00.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.A00.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    public float getDimension(int i) {
        return this.A00.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.A00.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.A00.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    public Drawable getDrawable(int i) {
        return this.A00.getDrawable(A00(i));
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(A00(i), i2, theme);
    }

    public float getFloat(int i) {
        return this.A00.getFloat(i);
    }

    public Typeface getFont(int i) {
        return this.A00.getFont(i);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.A00.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.A00.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.A00.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.A00.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.A00.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.A01.A0L(objArr, i, (long) i2);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.A01.A0F((long) i2, i);
    }

    public String getResourceEntryName(int i) {
        return this.A00.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.A00.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.A00.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.A00.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.A01.A0B(i);
    }

    public String[] getStringArray(int i) {
        return this.A00.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.A01.A0B(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.A00.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.A00.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.A00.getValueForDensity(i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.A00.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.A00.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.A00.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.A00.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public C18570xu(Resources resources, C620733j r5) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = resources;
        this.A01 = r5;
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public int getColor(int i, Resources.Theme theme) {
        return this.A00.getColor(i, theme);
    }

    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        return this.A00.getColorStateList(i, theme);
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return this.A00.getDrawable(A00(i), theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return this.A00.getDrawableForDensity(A00(i), i2);
    }

    public String getQuantityString(int i, int i2) {
        return this.A01.A0F((long) i2, i);
    }

    public String getString(int i, Object... objArr) {
        return this.A01.A0E(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        String A0B;
        if (i == 0 || (A0B = this.A01.A0B(i)) == null) {
            return charSequence;
        }
        return A0B;
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.A00.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.A00.openRawResource(i, typedValue);
    }
}
