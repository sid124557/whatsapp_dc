package X;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.3Cy  reason: invalid class name and case insensitive filesystem */
public final class C64303Cy implements AnonymousClass64L {
    public final Activity A00;
    public final AnonymousClass4FU A01;
    public final C69263Wi A02;
    public final C185068t0 A03;
    public final AnonymousClass74P A04;
    public final C620633i A05;
    public final C623834u A06;

    public boolean BM3(Intent intent, int i, int i2) {
        C95814uZ A0S;
        FileOutputStream openFileOutput;
        String str;
        FileOutputStream openFileOutput2;
        FileOutputStream openFileOutput3;
        String str2;
        AnonymousClass5QL r5;
        InputStream A062;
        C623834u r1;
        Uri uri;
        Uri data;
        boolean z;
        Uri uri2;
        int intExtra;
        Intent intent2 = intent;
        int i3 = i;
        int i4 = i2;
        if (i3 == 18) {
            if (i4 == -1) {
                if (!(intent == null || intent2.getData() == null)) {
                    A0S = C18310x6.A0S(intent2.getStringExtra("chat_jid"));
                    data = intent2.getData();
                    z = true;
                }
            } else if (i2 == 0 && intent != null && (intExtra = intent2.getIntExtra("error_message_id", -1)) > 0) {
                this.A02.A0N(this.A01, intExtra);
                return true;
            }
            return true;
        }
        if (i3 == 17) {
            if (i4 == -1 && intent != null) {
                A0S = C18310x6.A0S(intent2.getStringExtra("chat_jid"));
                boolean booleanExtra = intent2.getBooleanExtra("is_using_global_wallpaper", false);
                Activity activity = this.A00;
                Point A012 = C623834u.A01(activity);
                if (intent2.getData() != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("conversation/wallpaper/setup/src:");
                    C18260x0.A1L(A0o, intent2.getData().toString());
                    AnonymousClass5UR A0R = this.A05.A0R();
                    if (intent2.getBooleanExtra("FROM_INTERNAL_DOWNLOADS_KEY", false)) {
                        data = intent2.getData();
                        z = false;
                    } else {
                        if (A0R == null) {
                            Log.w("conversation/wallpaper/setup cr=null");
                        } else {
                            Cursor A032 = A0R.A03(intent2.getData(), (String[]) null, (String) null, (String[]) null, (String) null);
                            if (A032 != null) {
                                try {
                                    boolean moveToFirst = A032.moveToFirst();
                                    int columnIndex = A032.getColumnIndex("bucket_display_name");
                                    if (moveToFirst && columnIndex >= 0 && "WallPaper".equals(A032.getString(columnIndex))) {
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        try {
                                            A062 = A0R.A06(intent2.getData());
                                            BitmapFactory.decodeStream(A062, (Rect) null, options);
                                            if (options.outWidth == A012.x && options.outHeight == A012.y) {
                                                Uri data2 = intent2.getData();
                                                if (data2 == null) {
                                                    r1 = this.A06;
                                                    uri = null;
                                                } else {
                                                    r1 = this.A06;
                                                    uri = data2;
                                                }
                                                this.A03.Bnq(r1.A04(r1.A07(activity, uri, A0S, true)));
                                                C107655bf.A0Y(activity, data2);
                                                if (A062 != null) {
                                                    A062.close();
                                                }
                                                A032.close();
                                                return true;
                                            } else if (A062 != null) {
                                                A062.close();
                                            }
                                        } catch (FileNotFoundException e) {
                                            Log.e((Throwable) e);
                                        } catch (IOException e2) {
                                            Log.e((Throwable) e2);
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                    }
                                    A032.close();
                                } catch (Throwable th2) {
                                    try {
                                        A032.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        Uri data3 = intent2.getData();
                        Uri A052 = this.A06.A05();
                        Intent className = C18320x8.A07().setClassName(activity.getPackageName(), "com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview");
                        className.setData(data3);
                        className.putExtra("output", A052);
                        C627336j.A0D(className, A0S, "chat_jid");
                        className.putExtra("is_using_global_wallpaper", booleanExtra);
                        activity.startActivityForResult(className, 18);
                        this.A03.BsS();
                    }
                } else {
                    Log.d("conversation/wallpaper/clear/null_data");
                    C185068t0 r4 = this.A03;
                    r4.Ayu();
                    int intExtra2 = intent2.getIntExtra("selected_res_id", 0);
                    if (intExtra2 != 0) {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("conversation/wallpaper from pgk:");
                        A0o2.append(intExtra2);
                        A0o2.append(" [");
                        A0o2.append(A012.x);
                        C18320x8.A1K(A0o2);
                        A0o2.append(A012.y);
                        C18260x0.A1L(A0o2, "]");
                        int i5 = A012.x;
                        int i6 = A012.y;
                        C623834u r7 = this.A06;
                        if (intExtra2 == -1) {
                            r5 = r7.A07(activity, (Uri) null, A0S, true);
                        } else if (r7 instanceof C32531r5) {
                            C32531r5 r52 = (C32531r5) r7;
                            Drawable A042 = AnonymousClass366.A04(activity, r52.A02, intExtra2, i5, i6);
                            if (A042 == null) {
                                r5 = r52.A08(activity, A0S);
                            } else {
                                r5 = r52.A0H(activity, r52.A0I(activity, (BitmapDrawable) A042, A0S), AnonymousClass000.A1X(A0S));
                            }
                        } else {
                            C32521r4 r53 = (C32521r4) r7;
                            StringBuilder A0o3 = AnonymousClass001.A0o();
                            A0o3.append("wallpaper/set with resId with size (width x height): ");
                            A0o3.append(i5);
                            C18260x0.A0y("x", A0o3, i6);
                            Drawable A043 = AnonymousClass366.A04(activity, r53.A04, intExtra2, i5, i6);
                            r53.A00 = A043;
                            if (A043 != null) {
                                r53.A0H(activity, A043);
                            }
                            r5 = new AnonymousClass5QL(r53.A00, C18290x4.A0Z(), "DOWNLOADED", true);
                        }
                        r4.Bnq(r7.A04(r5));
                        C107655bf.A0Y(activity, (Uri) null);
                    } else if (intent2.hasExtra("wallpaper_color_file")) {
                        int intExtra3 = intent2.getIntExtra("wallpaper_color_file", 0);
                        boolean booleanExtra2 = intent2.getBooleanExtra("wallpaper_doodle_overlay", false);
                        C623834u r6 = this.A06;
                        if (r6 instanceof C32531r5) {
                            C32531r5 r72 = (C32531r5) r6;
                            if (booleanExtra2) {
                                str2 = "COLOR_WITH_WA_OVERLAY";
                            } else {
                                str2 = "COLOR_ONLY";
                            }
                            r72.A0L(activity, A0S, new AnonymousClass2P1(C18290x4.A0Z(), str2, String.valueOf(intExtra3)));
                        } else {
                            C32521r4 r54 = (C32521r4) r6;
                            r54.A00 = null;
                            try {
                                openFileOutput3 = activity.openFileOutput("wallpaper.jpg", 0);
                                openFileOutput3.write(4);
                                openFileOutput3.write(intExtra3);
                                openFileOutput3.flush();
                                openFileOutput3.close();
                            } catch (IOException e3) {
                                Log.e((Throwable) e3);
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            r54.A00 = r54.A04(r54.A0G(activity, false));
                            r54.A00 = true;
                        }
                        r4.Bnq(r6.A04(r6.A08(activity, A0S)));
                    } else {
                        if (intent2.getBooleanExtra("is_reset", false)) {
                            C623834u r55 = this.A06;
                            if (r55 instanceof C32531r5) {
                                ((C32531r5) r55).A0L(activity, A0S, new AnonymousClass2P1(C18290x4.A0Z(), "NONE", (String) null));
                            } else {
                                C32521r4 r56 = (C32521r4) r55;
                                Log.i("wallpaper/reset");
                                r56.A00 = null;
                                try {
                                    openFileOutput2 = activity.openFileOutput("wallpaper.jpg", 0);
                                    openFileOutput2.write(3);
                                    openFileOutput2.flush();
                                    openFileOutput2.close();
                                } catch (IOException e4) {
                                    Log.e((Throwable) e4);
                                } catch (Throwable th5) {
                                    th.addSuppressed(th5);
                                }
                                r56.A07.A05();
                            }
                            r4.Bnq((Drawable) null);
                            str = "conversation/wallpaper/reset";
                        } else if (intent2.getBooleanExtra("is_default", false)) {
                            C623834u r57 = this.A06;
                            if (r57 instanceof C32531r5) {
                                ((C32531r5) r57).A0L(activity, A0S, C32531r5.A07);
                            } else {
                                C32521r4 r62 = (C32521r4) r57;
                                Log.i("wallpaper/default");
                                r62.A00 = null;
                                try {
                                    openFileOutput = activity.openFileOutput("wallpaper.jpg", 0);
                                    openFileOutput.write(2);
                                    openFileOutput.flush();
                                    openFileOutput.close();
                                } catch (IOException e5) {
                                    Log.e((Throwable) e5);
                                } catch (Throwable th6) {
                                    th.addSuppressed(th6);
                                }
                                r62.A00 = r62.A04(r62.A0G(activity, false));
                                r62.A07.A05();
                            }
                            r4.Bnq(r57.A04(r57.A08(activity, A0S)));
                            str = "conversation/wallpaper/default";
                        } else {
                            this.A02.A0H(R.string.f11nameremoved, 0);
                            C18260x0.A1O(AnonymousClass001.A0o(), "conversation/wallpaper/invalid_file:", intent2);
                        }
                        Log.i(str);
                    }
                }
            }
            this.A03.BsS();
            return true;
        }
        return false;
        C623834u r12 = this.A06;
        Activity activity2 = this.A00;
        if (data == null) {
            uri2 = null;
        } else {
            uri2 = data;
        }
        this.A03.Bnq(r12.A04(r12.A07(activity2, uri2, A0S, z)));
        if (z) {
            C107655bf.A0Y(activity2, data);
        }
        return true;
        throw th;
        throw th;
        throw th;
        throw th;
    }

    public C64303Cy(Activity activity, AnonymousClass4FU r2, C69263Wi r3, C185068t0 r4, AnonymousClass74P r5, C620633i r6, C623834u r7) {
        this.A00 = activity;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
