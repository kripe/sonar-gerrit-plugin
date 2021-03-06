package org.jenkinsci.plugins.sonargerrit.inspection;

import com.google.common.collect.Multimap;
import org.jenkinsci.plugins.sonargerrit.inspection.entity.IssueAdapter;

import java.util.Collection;

/**
 * Project: Sonar-Gerrit Plugin
 * Author:  Tatiana Didik
 * Created: 19.12.2017 21:55
 */
public interface InspectionReportAdapter {
    Collection<IssueAdapter> getIssues();

    Multimap<String, IssueAdapter> getReportData();
}
