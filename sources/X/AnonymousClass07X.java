package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.07X  reason: invalid class name */
public class AnonymousClass07X extends AnonymousClass07Y implements View.OnClickListener {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    public static String A01(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final Drawable A05(String str) {
        WeakHashMap weakHashMap;
        Uri parse;
        FileNotFoundException fileNotFoundException;
        InputStream openInputStream;
        FileNotFoundException fileNotFoundException2;
        int i;
        Drawable drawable;
        Drawable drawable2 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("android.resource://");
                Context context = this.A0A;
                A0o.append(context.getPackageName());
                String A0Y = AnonymousClass000.A0Y("/", A0o, parseInt);
                WeakHashMap weakHashMap2 = this.A0C;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap2.get(A0Y);
                if (constantState == null) {
                    drawable = null;
                } else {
                    drawable = constantState.newDrawable();
                }
                if (drawable == null && (drawable = AnonymousClass0RP.A00(context, parseInt)) != null) {
                    weakHashMap2.put(A0Y, drawable.getConstantState());
                }
                return drawable;
            } catch (NumberFormatException unused) {
                weakHashMap = this.A0C;
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                if (constantState2 != null) {
                    drawable2 = constantState2.newDrawable();
                }
                if (drawable2 == null) {
                    parse = Uri.parse(str);
                    if ("android.resource".equals(parse.getScheme())) {
                        String authority = parse.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            try {
                                Resources resourcesForApplication = this.A0A.getPackageManager().getResourcesForApplication(authority);
                                List<String> pathSegments = parse.getPathSegments();
                                if (pathSegments != null) {
                                    int size = pathSegments.size();
                                    if (size == 1) {
                                        try {
                                            i = Integer.parseInt(AnonymousClass001.A0n(pathSegments, 0));
                                        } catch (NumberFormatException unused2) {
                                            fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0P(parse, "Single path segment is not a resource ID: ", AnonymousClass001.A0o()));
                                            throw fileNotFoundException2;
                                        }
                                    } else if (size == 2) {
                                        i = resourcesForApplication.getIdentifier(AnonymousClass001.A0n(pathSegments, 1), AnonymousClass001.A0n(pathSegments, 0), authority);
                                    } else {
                                        fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0P(parse, "More than two path segments: ", AnonymousClass001.A0o()));
                                    }
                                    if (i != 0) {
                                        drawable2 = resourcesForApplication.getDrawable(i);
                                    } else {
                                        fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0P(parse, "No resource found for: ", AnonymousClass001.A0o()));
                                    }
                                } else {
                                    fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0P(parse, "No path: ", AnonymousClass001.A0o()));
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                                fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0P(parse, "No package found for authority: ", AnonymousClass001.A0o()));
                            }
                        } else {
                            fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0P(parse, "No authority: ", AnonymousClass001.A0o()));
                        }
                        throw fileNotFoundException2;
                    }
                    openInputStream = this.A0A.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        drawable2 = Drawable.createFromStream(openInputStream, (String) null);
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.e("SuggestionsAdapter", AnonymousClass000.A0P(parse, "Error closing icon stream for ", AnonymousClass001.A0o()), e);
                        }
                    } else {
                        fileNotFoundException = new FileNotFoundException(AnonymousClass000.A0P(parse, "Failed to open ", AnonymousClass001.A0o()));
                    }
                }
            } catch (Resources.NotFoundException unused4) {
                Log.w("SuggestionsAdapter", AnonymousClass000.A0V("Icon resource not found: ", str, AnonymousClass001.A0o()));
                return null;
            } catch (Resources.NotFoundException unused5) {
                fileNotFoundException = new FileNotFoundException(AnonymousClass000.A0P(parse, "Resource does not exist: ", AnonymousClass001.A0o()));
            } catch (FileNotFoundException e2) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("Icon not found: ");
                A0o2.append(parse);
                Log.w("SuggestionsAdapter", AnonymousClass000.A0a(", ", A0o2, e2));
                drawable2 = null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    Log.e("SuggestionsAdapter", AnonymousClass000.A0P(parse, "Error closing icon stream for ", AnonymousClass001.A0o()), e3);
                }
                throw th;
            }
        }
        return drawable2;
        throw fileNotFoundException;
        if (drawable2 != null) {
            weakHashMap.put(str, drawable2.getConstantState());
        }
        return drawable2;
    }

    public CharSequence Azk(Cursor cursor) {
        String A012;
        if (cursor != null) {
            String A013 = A01(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (A013 == null) {
                SearchableInfo searchableInfo = this.A09;
                if (!searchableInfo.shouldRewriteQueryFromData() || (A013 = A01(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
                    if (!searchableInfo.shouldRewriteQueryFromText() || (A012 = A01(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                        return null;
                    }
                    return A012;
                }
            }
            return A013;
        }
        return null;
    }

    public AnonymousClass07X(SearchableInfo searchableInfo, Context context, SearchView searchView, WeakHashMap weakHashMap) {
        super(context, searchView.A0T);
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.A0S;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    public View A03(Context context, Cursor cursor, ViewGroup viewGroup) {
        View A0R = AnonymousClass001.A0R(this.A02, viewGroup, this.A01);
        A0R.setTag(new AnonymousClass0MH(A0R));
        ((ImageView) A0R.findViewById(R.id.edit_query)).setImageResource(this.A08);
        return A0R;
    }

    public void Ayj(Cursor cursor) {
        try {
            super.Ayj(cursor);
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public Cursor BkU(CharSequence charSequence) {
        String charSequence2;
        Cursor cursor;
        String suggestAuthority;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        SearchView searchView = this.A0B;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = this.A09;
                String[] strArr = null;
                if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                    cursor = null;
                } else {
                    Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                    }
                    fragment.appendQueryParameter("limit", String.valueOf(50));
                    cursor = this.A0A.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
                }
                if (cursor != null) {
                    cursor.getCount();
                    return cursor;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    public boolean hasStableIds() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r13 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r25, android.content.Context r26, android.database.Cursor r27) {
        /*
            r24 = this;
            java.lang.Object r9 = r25.getTag()
            X.0MH r9 = (X.AnonymousClass0MH) r9
            r8 = r24
            int r1 = r8.A00
            r0 = -1
            r7 = 0
            r10 = r27
            if (r1 == r0) goto L_0x0198
            int r17 = r10.getInt(r1)
        L_0x0014:
            android.widget.TextView r6 = r9.A03
            if (r6 == 0) goto L_0x002d
            int r0 = r8.A04
            java.lang.String r0 = A01(r10, r0)
            r6.setText(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 == 0) goto L_0x002a
            r0 = 8
        L_0x002a:
            r6.setVisibility(r0)
        L_0x002d:
            android.widget.TextView r3 = r9.A04
            r5 = 2
            r4 = 1
            if (r3 == 0) goto L_0x009a
            int r0 = r8.A06
            java.lang.String r12 = A01(r10, r0)
            if (r12 == 0) goto L_0x0190
            android.content.res.ColorStateList r0 = r8.A07
            if (r0 != 0) goto L_0x005c
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.Context r2 = r8.A0A
            android.content.res.Resources$Theme r1 = r2.getTheme()
            r0 = 2130970856(0x7f0408e8, float:1.7550434E38)
            r1.resolveAttribute(r0, r11, r4)
            android.content.res.Resources r1 = r2.getResources()
            int r0 = r11.resourceId
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)
            r8.A07 = r0
        L_0x005c:
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r12)
            r19 = 0
            android.content.res.ColorStateList r0 = r8.A07
            android.text.style.TextAppearanceSpan r2 = new android.text.style.TextAppearanceSpan
            r21 = r7
            r18 = r2
            r20 = r7
            r22 = r0
            r23 = r19
            r18.<init>(r19, r20, r21, r22, r23)
            int r1 = r12.length()
            r0 = 33
            r11.setSpan(r2, r7, r1, r0)
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0186
            if (r6 == 0) goto L_0x008b
            r6.setSingleLine(r7)
            r6.setMaxLines(r5)
        L_0x008b:
            r3.setText(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0097
            r0 = 8
        L_0x0097:
            r3.setVisibility(r0)
        L_0x009a:
            android.widget.ImageView r12 = r9.A00
            if (r12 == 0) goto L_0x00ad
            int r1 = r8.A01
            r0 = -1
            if (r1 != r0) goto L_0x00f8
            r13 = 0
        L_0x00a4:
            r0 = 4
            r12.setImageDrawable(r13)
            if (r13 != 0) goto L_0x00ee
            r12.setVisibility(r0)
        L_0x00ad:
            android.widget.ImageView r3 = r9.A01
            r2 = 8
            if (r3 == 0) goto L_0x00c1
            int r1 = r8.A02
            r0 = -1
            if (r1 != r0) goto L_0x00e5
            r0 = 0
        L_0x00b9:
            r3.setImageDrawable(r0)
            if (r0 != 0) goto L_0x00db
            r3.setVisibility(r2)
        L_0x00c1:
            int r0 = r8.A03
            if (r0 == r5) goto L_0x00cb
            if (r0 != r4) goto L_0x019c
            r0 = r17 & 1
            if (r0 == 0) goto L_0x019c
        L_0x00cb:
            android.widget.ImageView r1 = r9.A02
            r1.setVisibility(r7)
            java.lang.CharSequence r0 = r6.getText()
            r1.setTag(r0)
            r1.setOnClickListener(r8)
            return
        L_0x00db:
            r3.setVisibility(r7)
            r0.setVisible(r7, r7)
            r0.setVisible(r4, r7)
            goto L_0x00c1
        L_0x00e5:
            java.lang.String r0 = r10.getString(r1)
            android.graphics.drawable.Drawable r0 = r8.A05(r0)
            goto L_0x00b9
        L_0x00ee:
            r12.setVisibility(r7)
            r13.setVisible(r7, r7)
            r13.setVisible(r4, r7)
            goto L_0x00ad
        L_0x00f8:
            java.lang.String r0 = r10.getString(r1)
            android.graphics.drawable.Drawable r13 = r8.A05(r0)
            if (r13 != 0) goto L_0x00a4
            android.app.SearchableInfo r0 = r8.A09
            android.content.ComponentName r16 = r0.getSearchActivity()
            java.lang.String r11 = r16.flattenToShortString()
            java.util.WeakHashMap r3 = r8.A0C
            boolean r0 = r3.containsKey(r11)
            r2 = 0
            if (r0 == 0) goto L_0x012b
            java.lang.Object r1 = r3.get(r11)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x017a
            android.content.Context r0 = r8.A0A
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r13 = r1.newDrawable(r0)
        L_0x0127:
            if (r13 == 0) goto L_0x017a
            goto L_0x00a4
        L_0x012b:
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r0 = r8.A0A
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            r14 = 128(0x80, float:1.794E-43)
            r0 = r16
            android.content.pm.ActivityInfo r0 = r13.getActivityInfo(r0, r14)     // Catch:{ NameNotFoundException -> 0x013c }
            goto L_0x0146
        L_0x013c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            r13 = r2
            goto L_0x0171
        L_0x0146:
            int r14 = r0.getIconResource()
            if (r14 == 0) goto L_0x0170
            java.lang.String r15 = r16.getPackageName()
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r15, r14, r0)
            if (r13 != 0) goto L_0x0175
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Invalid icon resource "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = " for "
            r13.append(r0)
            java.lang.String r0 = r16.flattenToShortString()
            X.AnonymousClass000.A1F(r0, r1, r13)
        L_0x0170:
            r13 = r2
        L_0x0171:
            r3.put(r11, r2)
            goto L_0x0127
        L_0x0175:
            android.graphics.drawable.Drawable$ConstantState r2 = r13.getConstantState()
            goto L_0x0171
        L_0x017a:
            android.content.Context r0 = r8.A0A
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r13 = r0.getDefaultActivityIcon()
            goto L_0x00a4
        L_0x0186:
            if (r6 == 0) goto L_0x008b
            r6.setSingleLine(r4)
            r6.setMaxLines(r4)
            goto L_0x008b
        L_0x0190:
            int r0 = r8.A05
            java.lang.String r11 = A01(r10, r0)
            goto L_0x007d
        L_0x0198:
            r17 = 0
            goto L_0x0014
        L_0x019c:
            android.widget.ImageView r0 = r9.A02
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07X.A04(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A022 = A02(this.A0A, this.A02, viewGroup);
            if (A022 != null) {
                ((AnonymousClass0MH) A022.getTag()).A03.setText(e.toString());
            }
            return A022;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A032 = A03(this.A0A, this.A02, viewGroup);
            ((AnonymousClass0MH) A032.getTag()).A03.setText(e.toString());
            return A032;
        }
    }

    public void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = this.A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.A0G((CharSequence) tag);
        }
    }
}
