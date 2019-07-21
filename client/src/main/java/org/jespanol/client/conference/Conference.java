package org.jespanol.client.conference;

import org.jespanol.client.session.Session;
import org.jespanol.client.speaker.Speaker;

import javax.ws.rs.FormParam;
import java.time.Year;
import java.util.List;
import java.util.Objects;

public class Conference {

    @FormParam("id")
    private String id;

    @FormParam("name")
    private String name;

    @FormParam("city")
    private String city;

    @FormParam("link")
    private String link;

    @FormParam("year")
    private Year year;

    private List<Speaker> speakers;

    private List<Session> sessions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Conference conference = (Conference) o;
        return Objects.equals(id, conference.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", link='" + link + '\'' +
                ", year=" + year +
                ", speakers=" + speakers +
                ", sessions=" + sessions +
                '}';
    }
}
