package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

public abstract class CronetEngine {
    public static final String TAG = "CronetEngine";

    public class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        public final ICronetEngineBuilder mBuilderDelegate;

        public abstract class LibraryLoader {
            public abstract void loadLibrary(String str);
        }

        public static int compareVersions(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i = 0;
            while (i < split.length && i < split2.length) {
                try {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                    i++;
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert version segments into integers: ");
                    sb.append(split[i]);
                    sb.append(" & ");
                    sb.append(split2[i]);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            }
            return Integer.signum(split.length - split2.length);
        }

        public static ICronetEngineBuilder createBuilderDelegate(Context context) {
            ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
            getEnabledCronetProviders(context, arrayList);
            CronetProvider cronetProvider = (CronetProvider) arrayList.get(0);
            String str = CronetEngine.TAG;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, String.format("Using '%s' provider for creating CronetEngine.Builder.", new Object[]{cronetProvider}));
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        public Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        public Builder addQuicHint(String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public CronetEngine build() {
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z) {
            ICronetEngineBuilder iCronetEngineBuilder = this.mBuilderDelegate;
            return this;
        }

        public Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        @Deprecated
        public Builder enableSdch(boolean z) {
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public static List getEnabledCronetProviders(Context context, List list) {
            if (list.size() != 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((CronetProvider) it.next()).isEnabled()) {
                        it.remove();
                    }
                }
                if (list.size() != 0) {
                    Collections.sort(list, new Comparator() {
                        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals("Google-Play-Services-Cronet-Provider")) {
                                return 1;
                            }
                            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals("Google-Play-Services-Cronet-Provider")) {
                                return -1;
                            }
                            return -Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
                        }
                    });
                    return list;
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mBuilderDelegate = iCronetEngineBuilder;
        }
    }

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public abstract byte[] getGlobalMetricsDeltas();

    public abstract String getVersionString();

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();
}
